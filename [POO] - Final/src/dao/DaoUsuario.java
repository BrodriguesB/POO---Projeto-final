package dao;

import java.sql.Connection;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
import java.util.Vector; 


import database.Conexao;
import model.*;

public class  DaoUsuario {

	
	/*
	 * 
	 * private final String url= "jdbc:postgresql://localhoat:5432/ByteFood";
	 * 
	 * private final String userName = "postgres";
	 * private final String password = "1234";
	 *
	 */
	

	//private Connection con;
	private Statement comando;
	
	
	public void insereUsuario(User user,Connection connect) throws SQLException {
		
		comando=connect.createStatement();
		
		try {
			comando.executeUpdate("INSERT INTO usuario (email,password) VALUES('"+ user.getLogin() + "','"+user.getPassword() + "')");
		
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}	
	}

	public void insereCliente(Client cliente) {
		
		
		try {
			comando.executeUpdate("INSERT INTO cliente (nome,cpf) VALUES('"+ cliente.getNome() + "','"+cliente.getCpf() + "')");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void insereServico(Server servico) {
		try {
			comando.executeUpdate("INSERT INTO servico (nome,cnpj) VALUES('"+ servico.getNome() + "','"+servico.getCnpj() + "')");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public void buscaLoginPassword(){
		
	}
	
	
	
}
  

 