package model;

import java.util.Scanner;

public class Client extends User{

	Server[] favoritos = new Server[100]; 
	Pedido pedidos;
	
	private String nome;
	private String cpf;

	public Server[] getFavoritos() {
		return favoritos;
	}
	public void setFavoritos(Server[] favoritos) {
		this.favoritos = favoritos;
	}
	public Pedido getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pedido pedidos) {
		this.pedidos = pedidos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	public Client() {
		super();
	}
	@Override
	public void vizualizarPedidos() {
		
	}
	
	@Override
	public void vizualizarPerfil() {
		
	}
	
	@Override 
	public void cadastrarUsuario() {
		Scanner input = new Scanner(System.in);
			
		System.out.println("Email:");
		this.setLogin(input.nextLine());
		
		System.out.println("Senha:");
		this.setPassword(input.nextLine());
	
		System.out.println("Nome:");
		this.setNome(input.nextLine());

		System.out.println("Cpf:");
		this.setCpf(input.nextLine());

		
		String teste="INSERT INTO usuario (email,password) VALUES ('"+ this.getLogin() + "','"+ this.getPassword() + "')";
		System.out.println(teste);
	}
	
	
	
	

	
}
