package control;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import model.Client;
import model.Server;
import model.User;
import dao.DaoUsuario;

public class Controle {
	
	private int tipo;
	DaoUsuario dao = new DaoUsuario();
	

	public void cadastrarUsuario(Connection connect) throws SQLException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\t\t\t[01]Cliente:");
		System.out.println("\t\t\t\t[02]Servico:");
		System.out.println(">>_");
		this.setTipo(input.nextInt());
		
		
		if(this.getTipo()==1) {
			User cliente = new Client();
			cliente.cadastrarUsuario();
			dao.insereUsuario(cliente,connect);
			dao.insereCliente((Client)cliente);
			
		}else if(this.getTipo()==2) {
			User servico = new Server();
			servico.cadastrarUsuario();
			dao.insereUsuario(servico,connect);
			dao.insereServico((Server)servico);
		}
		

		System.out.println("Usuário cadastrado com sucesso!");
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
