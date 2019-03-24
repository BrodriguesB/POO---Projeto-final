package model;

import java.util.Scanner;

public class Delivery extends Cardapio {
	
	private int estado;
	private int cidade;
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	
	public void fazerEntrega(Pedido pedido) {
		
	}

	public void fazerPagamento(Pedido pedido) {
	
	}
	public void enderecoEntrega() {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Endereço"+"\n");
	System.out.println("Estado");
	this.setEstado(input.nextInt());
	System.out.println("Cidade");
	this.setCidade(input.nextInt());
	System.out.println("Rua");
	this.setRua(input.nextLine());
	System.out.println("Numero");
	this.setNumero(input.nextInt());
	System.out.println("Complemento");
	this.setComplemento(input.nextLine());
	System.out.println("Bairro");
	this.setBairro(input.nextLine());
	}
	
	
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getCidade() {
		return cidade;
	}
	public void setCidade(int cidade) {
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}

