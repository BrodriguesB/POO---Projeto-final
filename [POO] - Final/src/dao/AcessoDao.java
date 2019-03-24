/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
// Data acess object

import Conexao.ConexaoMySQL;
import dto.AcessoDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class AcessoDao {
    
    public void inserir(AcessoDto obj) {
        ConexaoMySQL objBanco = new ConexaoMySQL();
        
        String lusuario = obj.getUsuario();
        String lsenha = obj.getSenha();

        
        objBanco.conectar();
        try {
            String sql = "INSERT into acesso (usuario, senha)" + " VALUES (?,?)";
            PreparedStatement objPst = 
                    objBanco.conexao.prepareStatement(sql);
            objPst.setString(1, lusuario);
            objPst.setString(2, lsenha);

            
            objPst.execute();
            JOptionPane.showMessageDialog(null, "comando INSERT executado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na execução do INSERT "+ex.getMessage());
        }
    }
    
    public void alterar(AcessoDto obj){
        ConexaoMySQL objBanco = new ConexaoMySQL();
        
        String lusuario = obj.getUsuario();
        String lsenha = obj.getSenha();
        
        objBanco.conectar();
        try {
            String sql = "UPDATE acesso SET usuario=?, senha=? WHERE usuario = ?";
            PreparedStatement objPst = 
                    objBanco.conexao.prepareStatement(sql);
            objPst.setString(1, lusuario);
            objPst.setString(2, lsenha);
            
            objPst.execute();
            JOptionPane.showMessageDialog(null, "comando alterar executado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na execução do alterar "+ex.getMessage());
        }
    }
    
    public void deletar(AcessoDto obj){
        ConexaoMySQL objBanco = new ConexaoMySQL();
        
        String lusuario = obj.getUsuario();

        objBanco.conectar();
        try {
            String sql = "DELETE FROM acesso WHERE usuario = ?";
            PreparedStatement objPst = 
                    objBanco.conexao.prepareStatement(sql);

            objPst.setString(1, lusuario);
            
            objPst.execute();
            JOptionPane.showMessageDialog(null, "comando DELETAR executado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na execução do DELETAR "+ex.getMessage());
        }
    }
    
    public ResultSet selecionar(){
        ConexaoMySQL objBanco = new ConexaoMySQL();
        
        objBanco.conectar();
        try {
            String sql = "SELECT acesso.* FROM acesso ";
            PreparedStatement objPst = 
                    objBanco.conexao.prepareStatement(sql);

            ResultSet objRst = objPst.executeQuery();
            JOptionPane.showMessageDialog(null, "comando SELECIONAR executado com sucesso");
            return objRst;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na execução do SELECIONAR "+ex.getMessage());
        }
        return null;
    }

    public ResultSet selecionarUsuario(AcessoDto objAcesso) {
        ConexaoMySQL objBanco = new ConexaoMySQL();
        
        objBanco.conectar();
        try {
            String sql = "SELECT acesso.* FROM acesso WHERE usuario= ?";
            
            PreparedStatement objPst = 
                    objBanco.conexao.prepareStatement(sql);
            
            objPst.setString(1, objAcesso.getUsuario());

            ResultSet objRst = objPst.executeQuery();
            JOptionPane.showMessageDialog(null, "comando SELECIONAR executado com sucesso");
            return objRst;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na execução do SELECIONAR "+ex.getMessage());
        }
        return null;
    }
}
