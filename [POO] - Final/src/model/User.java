package model;

import java.util.Scanner;

import dao.DaoUsuario;

import database.Database;

public class User {
	
	private String login;
	private String password;


	
	User[] cliente =new Client[100]; 
	User[] servico =new Server[100]; 
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	public void fazerLogin(Database dt) {
		
		this.verificarLogin(dt);
		this.verificarLogin(dt);
		System.out.println("Login Feito com sucesso");
		
	}
	
	public void verificarLogin(Database dt) {
		
		Scanner input = new Scanner(System.in);
		
		//chamar DAO
		
		System.out.println("Login:");
		this.setLogin(input.nextLine());
		do {
			System.out.println("Login inválido");
			this.setLogin(input.nextLine());
			
		}while(dt.getLoginDB() == this.getLogin());
		
	}
	public void verificarPassword(Database dt) {
		
		Scanner input = new Scanner(System.in);
		
		//chamar DAO
		
		System.out.println("Password:");
		this.setPassword(input.nextLine());
		
		do {
			System.out.println("Password inválida");
			this.setPassword(input.nextLine());
		}while(dt.getPasswordDB() == this.getPassword());
			
		
		
	}
	
	public void cadastrarUsuario() {
		
	
		}
		
		
		

		
		//criar as query's de insert in to com SQL para inserir no DB
	
	
	public void vizualizarServicos() {
		
	}
	
	public void vizualizarPedidos() {
		
	}
	
	public void vizualizarPerfil() {
	
	}
	

	public void inserirCardapio() {
		
	}


	
}

