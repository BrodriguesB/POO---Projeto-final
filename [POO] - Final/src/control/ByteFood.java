package control;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import database.Conexao;
import database.Database;
import model.Client;
import model.Pedido;
import model.Server;
import model.User;

public class ByteFood {

	public static void main(String[] args) throws SQLException {
		
		Conexao con = new Conexao();
		Database dt= new Database();
		User user= new User();
		Pedido pedidos=new Pedido();
		User cliente = new Client();
		User servico = new Server();
		Controle control = new Controle();
		int opcao;
		Scanner input = new Scanner(System.in);
		Connection connect=null;
		
		connect=con.getConnection();
		
		System.out.println("\t\t\t\t[01]- Cadastrar Usuário:");
		System.out.println("\t\t\t\t[02]- Fazer Login:");
		System.out.println(">>_");
		opcao = input.nextInt();
		
		if(opcao==1) {
			control.cadastrarUsuario(connect);
		}else if(opcao==2) {
			user.fazerLogin(dt);
			System.out.println("\t\t\t\t[01]- Buscar Locais:");
			System.out.println("\t\t\t\t[02]- Vizualizar meus pedidos:");
			System.out.println("\t\t\t\t[03]- Vizualizar meus pedidos para entrega:");
			System.out.println("\t\t\t\t[04]- Atualizar Cardápio:");
			System.out.println("\t\t\t\t[05]- Fazer pedido:");
			System.out.println(">>_");
			opcao = input.nextInt();
			//colocar as opcoes dentro de acordo com o tipo de usuario
		}else if(opcao==1){
			servico.vizualizarServicos();
		}else if(opcao==2) {
			cliente.vizualizarPedidos();
		}else if(opcao==3) {
			servico.vizualizarPedidos();
		}else if(opcao==4) {
			servico.inserirCardapio();
		}else if(opcao==5) {
			//pedidos.fazerPedido() ;//passar parametro
		}
		
	
		//conectar no banco
		//cadastrar usuario
		//fazer login
		//ver serviços 
		//fazer pedido
		//vizualizar meus pedidos cliente
		//vizualizar meus pedidos serviço
		//vizualizar meu perfil cliente/servico
		///inserir itens cardapio
		
	}

}



