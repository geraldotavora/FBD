package br.com.quixada.ufc.recfilme.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.quixada.ufc.recfilme.dao.UsuarioDAO;
import br.com.quixada.ufc.recfilme.pojo.Tipo_Filme;
import br.com.quixada.ufc.recfilme.pojo.Usuario;

public class Main {

	public static void main(String[] args) {
		UsuarioDAO userDAO = new UsuarioDAO();
		
		int option;
		Scanner scan = new Scanner(System.in);
		boolean end = false;

		while(!end) {
			System.out.println(	"escolha uma opção:\n"+
								"1 - Cad user\n"+
								"2 - Excluir usuario\n"+
								"3 - Exibir usuarios\n");
			
			option = scan.nextInt();
			scan.nextLine();
			
			switch(option) {
			case 1:
				String nome, email, endereco, genero, ator;
				System.out.println("Digite o nome");
				nome = scan.nextLine();
				System.out.println("Digite o email");
				email = scan.nextLine();
				System.out.println("Digite o endereco");
				endereco = scan.nextLine();
				System.out.println("Digite o genero");
				genero = scan.nextLine();
				System.out.println("Digite o ator");
				ator = scan.nextLine();
				
				Usuario user = new Usuario(nome, email, endereco, genero, ator);
				
				
				if(userDAO.addUser(user)) {
					System.out.println("Usuario adicionado");
				}else {
					System.out.println("Erro!");
				}
				break;
			case 2:
				System.out.println("Digite o id");
				int id = scan.nextInt();
				if(userDAO.deleteUser(id)) {
					System.out.println("Usuario excluido!");
				}else {
					System.out.println("Erro!");
				}
				break;
			case 3:
				ArrayList<Usuario> userlist = userDAO.getListUser();
					for(Usuario us : userlist)
						System.out.println(us.toString());
				break;
			default:
				System.out.println("Opcao invalida");
				break;
			}
		}
			
	}

}
