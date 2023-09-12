/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DaoUsuario;
import java.util.ArrayList;
import model.ModelUsuario;

/**
 * @author Diego Barbosa da Silva
 */
public class ControllerUsuario {

    private DaoUsuario daoUsuarios = new DaoUsuario();

    /**
     * Salvar usuario controller
     * @return int
     */
    public int salvarUsuarioController(ModelUsuario pModelUsuarios) {
        return this.daoUsuarios.salvarUsuarioDao(pModelUsuarios);
    }

    /**
     * Validar login de usuário.
     * @param pmodelUsuario
     * @return 
     */
    public boolean getUsuarioController(ModelUsuario pmodelUsuario) {
        return this.daoUsuarios.getValidarUsuarioDao(pmodelUsuario);
    }

}
