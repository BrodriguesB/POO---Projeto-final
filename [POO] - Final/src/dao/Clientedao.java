/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
// Data acess object

import Conexao.ConexaoMySQL;
import dto.ClienteDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Clientedao {
    
    public void inserir(ClienteDto obj) {
        ConexaoMySQL objBanco = new ConexaoMySQL();
        
        String lnome = obj.getNome();
        String lcpf = obj.getCpf();
        String lendereco = obj.getEndereco();
        String lbairro = obj.getBairro();
        String lcidade = obj.getCidade();
        
        objBanco.conectar();
        try {
            String sql = "INSERT into Cliente (nome, cpf, endereco, bairro, cidade VALUES (?,?,?,?,?)";
            PreparedStatement objPst = 
                    objBanco.conexao.prepareStatement(sql);
            objPst.setString(1, lnome);
            objPst.setString(2, lcpf);
            objPst.setString(3, lendereco);
            objPst.setString(4, lbairro);
            objPst.setString(5, lcidade);
            
            objPst.execute();
            JOptionPane.showMessageDialog(null, "comando INSERT executado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na execução do INSERT "+ex.getMessage());
        }
    }
    
    public void alterar(ClienteDto obj){
        ConexaoMySQL objBanco = new ConexaoMySQL();
        
        String lnome = obj.getNome();
        String lcpf = obj.getCpf();
        String lendereco = obj.getEndereco();
        String lbairro = obj.getBairro();
        String lcidade = obj.getCidade();
        
        objBanco.conectar();
        try {
            String sql = "UPDATE Cliente SET nome=?, endereco=?, bairro=?, cidade=? WHERE cpf = ?";
            PreparedStatement objPst = 
                    objBanco.conexao.prepareStatement(sql);
            objPst.setString(1, lnome);
            objPst.setString(2, lendereco);
            objPst.setString(3, lbairro);
            objPst.setString(4, lcidade);
            objPst.setString(5, lcpf);
            
            objPst.execute();
            JOptionPane.showMessageDialog(null, "comando alterar executado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na execução do alterar "+ex.getMessage());
        }
    }
    
    public void deletar(ClienteDto obj){
        ConexaoMySQL objBanco = new ConexaoMySQL();
        
        String lcpf = obj.getCpf();

        objBanco.conectar();
        try {
            String sql = "DELETE FROM cliente WHERE cpf = ?";
            PreparedStatement objPst = 
                    objBanco.conexao.prepareStatement(sql);

            objPst.setString(1, lcpf);
            
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
            String sql = "SELECT cliente.* FROM cliente ";
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
}
