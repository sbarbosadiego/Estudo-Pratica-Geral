/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.ConexaoMySql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelUsuario;

/**
 * @author Diego Barbosa da Silva
 */
public class DaoUsuario extends ConexaoMySql {

    /**
     * Realiza a inserção de um novo usuário.
     * @param pModelAluno
     * @return int
     */
    public int salvarUsuarioDao(ModelUsuario pModelUsuario) {
        try {
            String sql = "INSERT INTO usuario (nome, login, senha, email) VALUES (?,?,?,?);";
            PreparedStatement stmt = this.conectar().prepareStatement(sql);
            stmt.setString(1, pModelUsuario.getNome());
            stmt.setString(2, pModelUsuario.getLogin());
            stmt.setString(3, pModelUsuario.getSenha());
            stmt.setString(4, pModelUsuario.getEmail());
            stmt.executeUpdate();
            return 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        } finally {
            this.desconectar();
        }
    }

    /**
     * Validar login de usuário.
     * @param pModelUsuario
     * @return boolean
     */
    public boolean getValidarUsuarioDao(ModelUsuario pModelUsuario) {
        try {
            String sql = "SELECT id, nome, login, senha , email FROM usuario WHERE login = ? AND senha = ?;";
            PreparedStatement statement = this.conectar().prepareStatement(sql);
            statement.setString(1, pModelUsuario.getLogin());
            statement.setString(2, pModelUsuario.getSenha());
            ResultSet retorno = statement.executeQuery();
            if (retorno.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconectar();
        }
    }

}
