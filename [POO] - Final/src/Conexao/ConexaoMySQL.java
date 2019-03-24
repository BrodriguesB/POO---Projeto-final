package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class ConexaoMySQL {

    String URL = "jdbc:mysql://127.0.0.1:3306/Bytefood";
    String usuario = "root";
    String senha = "1234";
    public Connection conexao = null;

    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, usuario, senha);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Driver");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Conexão ; " + ex.getMessage());
        }
    }

    public void desconectar() {
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Conexão Encerrada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na tentativa de Desconexão");
        }
    }

    //Classe de execução de comandos no BD
    public void executarComando(String sql) {
        try {
            Statement objStm = conexao.createStatement();
            objStm.execute(sql);
            JOptionPane.showMessageDialog(null, "Comando executado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar comando" + ex.getMessage());
        }
    }

    public ResultSet executarConsulta(String sql) {
        try {
            Statement objStm = conexao.createStatement();
            ResultSet objRs = objStm.executeQuery(sql);
            JOptionPane.showMessageDialog(null, "Comando executado com sucesso");
            return objRs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar comando" + ex.getMessage());
        }
        return null;
    }
}
