package conexao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 * @author Diego Barbosa da Silva
 */
public class ConexaoMySql {

    private boolean status = false;
    private Connection connection = null;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private Statement states;

    public ConexaoMySql() {
        
    }
    
    /**
     * Retorna os dados de acesso configurados no properties.
     * @return prop
     */
    private static Properties loadProperties() {
        try {
            Properties prop = new Properties();
            String caminho = "/db.properties";
            prop.load(ConexaoMySql.class.getResourceAsStream(caminho));
            return prop;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Fueda");
        }
        return null;
    }

    /**
     * Realiza a conexão com a base de dados.
     * @return connection
     */
    public Connection conectar() {
        try {
            // Carrega o driver do JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Retorna os dados do properties
            Properties properties = loadProperties();
            final String urlBanco = properties.getProperty("banco.url");
            final String userBanco = properties.getProperty("banco.usuario");
            final String passwordBanco = properties.getProperty("banco.senha");
            // Conecta no banco de dados
            this.setConnection((Connection) DriverManager.getConnection(
                    urlBanco,
                    userBanco,
                    passwordBanco));
            // Chama o método que configura o banco de dados
            this.status = true;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        return connection;
    }

    /**
     * Encerra a conexão com o banco de dados.
     * @return boolean
     */
    public boolean desconectar() {
        try {
            if ((this.getResultSet() != null) && (this.statement != null)) {
                this.getResultSet().close();
                this.statement.close();
            }
            this.getConnection().close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    protected ResultSet getResultSet() {
        return resultSet;
    }

    protected void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    protected boolean getStatus() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    protected Connection getConnection() {
        return connection;
    }

    protected void setConnection(Connection connection) {
        this.connection = connection;
    }

    protected PreparedStatement getPreparedStatement() {
        return statement;
    }

    protected void setPreparedStatement(PreparedStatement statement) {
        this.states = statement;
    }

}
