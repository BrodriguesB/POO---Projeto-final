package model;

import java.util.Scanner;

public class Server extends User{

	int avaliacao;
	String categoria;
	Cardapio cardapio;
	Pedido[] pedidos= new Pedido[100]; 
	
	private String nome;
	private String cnpj;
	
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Cardapio getCardapio() {
		return cardapio;
	}
	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}
	public Pedido[] getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}

	public String getCnpj() {
		return cnpj;
	}


	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void vizualizarServicos() {
		
	}
	
	@Override
	public void vizualizarPedidos() {
		
	}
	
	@Override
	public void vizualizarPerfil() {
		
	}
	
	@Override
	public void inserirCardapio() {
		
	}
	
	@Override 
	public void cadastrarUsuario() {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Email:");
		this.setLogin(input.nextLine());
		
		System.out.println("Senha:");
		this.setPassword(input.nextLine());

		System.out.println("Nome da Sua marca:");
		this.setNome(input.nextLine());
		
		System.out.println("Cnpj:");
		this.setCnpj(input.nextLine());
		
	
		
		
	}
	

}

