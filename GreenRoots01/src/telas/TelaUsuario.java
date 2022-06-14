package telas;
import java.util.Scanner;
import perfil.Usuario;
import repositorio.Mediador;

public class TelaUsuario {
	private static Scanner INPUT = new Scanner(System.in);
	Mediador med = new Mediador();
	private Usuario conta = null;
	
	public void entrar() {
		System.out.println("----  GREEN ROOTS  ----");
		
		if (conta == null) {
			System.out.println("1- Login\n2- Cadastro");
			
			
			while(true){
				int opc = INPUT.nextInt();
				
				if (opc == 1) {
					if (telaLogin()) {
						break;
					}
					System.out.println("Usuario ou senha incorretos");
					System.out.println("1- Tentar login novamente \n2- fazer cadastro");
				}
				else if (opc == 2) {
					if (telaCadastro()){
						if (telaLogin()){
							break;
						}
						System.out.println("1- Tentar login novamente \n2- fazer cadastro");
					
					}
					else {
						System.out.println("1- Fazer login \n2- tentar fazer cadastro novamente");
					
					}
					
				}
				
				else {
					System.out.println("Valor invalido!\n Forneça outro valor 1- Login\n2- Cadastro");

				}	
			}
			Tela();
			
			
		}
			
		else {
			Tela();
		}
		
		System.out.println("1- Sair\n2- Continuar");
		int opc = INPUT.nextInt();
		if (opc == 1) {
			return;
		}
		else {
			entrar();
		}
			 
				
	}
	
	public boolean telaLogin(){
		
		System.out.println("Forneça seu email: ");
		String email = INPUT.next();
		System.out.println("Forneça sua senha: ");
		String senha = INPUT.next();
		conta = med.login(email, senha);
		if (conta != null){
			return true;
		}
		return false;
	}
	
	public boolean telaCadastro() {
		System.out.println("Nome: ");
		String nome = INPUT.next();
			
		System.out.println("Data de nascimento: ");
		System.out.println("Dia: ");
		int dia = INPUT.nextInt();
		System.out.println("Mes: ");
		int mes = INPUT.nextInt();
		System.out.println("Ano: ");
		int ano = INPUT.nextInt();
			
		System.out.println("Email: ");
		String email = INPUT.next();
		System.out.println("Telefone: ");
		String cell = INPUT.next();
		System.out.println("Senha: ");
		String senha = INPUT.next();
			
		if (med.cadastro(nome, dia, mes, ano, email, cell, senha)) {
			return true;
		}
		
		return false;
		
		
	}
	
	public void Tela() {
		
		int br = 0;
		while (true) {
			printHOMEPAGE();
			int opcao = INPUT.nextInt();
			switch (opcao) {
			
			case 1,2,3: {
				TRINDADE(opcao);
				break;
			}
			
			case 4: {
				perfil();
				break;
			}
			
			case 5: {
				System.out.println("\n!!NOTICIAS!!\n"
				+ "\n"
				+ "Obsolescência Programada, também chamada de obsolescência planejada,\n"
				+ "é quando um produto lançado no mercado se torna inutilizável ou obsoleto\n"
				+ "em um período de tempo relativamente curto de forma proposital, ou seja,\n"
				+ "quando empresas lançam mercadorias para que sejam rapidamente descartadas\n"
				+ "e estimulam o consumidor a comprar novamente.");
				break;
			}
			
			case 6: {
				System.out.println("\nPontos de interesse famosos!\n\n");
				System.out.println("-------"
								  +"|  x  |"
							  	  +"|  j  |"
							  	  +"-------");
				break;
			}
			
			case 7: {
				System.out.println("Processo em desenvolvimento");
				break;
			}
			
			case 8: {
				carloBOT();
				break;
			}
			
			case 9: {
				br = 1;
				conta = null;
				break;
			}
			
			default:
				System.out.println("Valor " + opcao + "invalido\n");
				
			}
			if (br == 1)
				break;
		}
	}
	
	public void printTRINDADE() {
		System.out.println("1- Mapa\n"
						  +"2- QR code\n"
						  +"3- Home");
		
	}
	
	public void TRINDADE(int opcao) {
		switch (opcao) {
			case 1: {
				mapa();
				break;
			}
			
			case 2: {
				qrCODE();
				break;
			}
			
			case 3: {
				//Tela();
				break;
			}
		}
		
	}
	
	public void printHOMEPAGE() {
		printTRINDADE();
		System.out.println(""
				+ "4- Perfil\n"
				+ "5- Noticias\n"
				+ "6- Pontos de interesse mais famosos\n"
				+ "7- Pesquisa\n"
				+ "8- CarloBot\n"
				+ "9- Sair\n");
		
	}	
	
	public void perfil(){
		med.perfil(conta);
		printTRINDADE();
		System.out.print("4- Editar perfil\n");
		int opcao = INPUT.nextInt();
		
		switch (opcao) {
		case 1,2,3: {
			TRINDADE(opcao);
			break;
		}
		
		case 4: {
			editarPerfil();
			break;
		}
		default:
			
			System.out.println("Comando invalido\n");
			perfil();
		}
		
	}
	public void editarPerfil(){
		System.out.println("Digite 1 para alterar senha, 2  para alterar nome ou 3 para retornar para perfil");
		int comando = INPUT.nextInt(); 
		switch (comando) {
		case 1: {
			System.out.println("informe sua senha atual: ");
			String senhaAtual = INPUT.next();
			System.out.println("informe uma nova senha: ");
			String novaSenha = INPUT.next();
			if (!med.alteraSenha(conta, senhaAtual, novaSenha)){
				editarPerfil();
				break;
			}
			System.out.println("Senha alterada com sucesso!");
			perfil();
			break;
		}
		case 2: {
			System.out.println("informe sua senha: ");
			String senha = INPUT.next();
			System.out.println("informe seu nome: ");
			String nome = INPUT.next();
			if (!med.alteraNome(conta, nome, senha)){
				editarPerfil();
				break;
			}
			System.out.println("Nome alterado com sucesso!");
			perfil();
			break;
			
		}
		case 3: {
			perfil();
			break;
		}
		default:
			System.out.println("comando incorreto");
			editarPerfil();
		}
	}
	public void mapa() {
		System.out.println("\nMAPA\n\n");
		System.out.println(  "---------------\n"
							+"|y||      ||x |\n"
							+"|=  ======  ==|\n"
							+"| ||      ||  |\n"
							+"| ||      ||  |\n"
							+"| ||j     ||  |\n"
							+"| ||      ||  |\n"
							+"| ||======  ==|\n"
							+"| ||      ||  |\n"
							+"| ||     u||  |\n"
							+"|=  ======  ==|\n"
							+"---------------");
		printTRINDADE();
		System.out.print(""
				+ "4- Selecionar ponto de coleta Y\n"
				+ "5- Selecionar ponto de coleta X\n"
				+ "6- Selecionar ponto de coleta J\n"
				+ "7- Selecionar ponto de coleta u\n");
		int opcao = INPUT.nextInt();
		switch (opcao) {
		case 1, 2, 3: {
			TRINDADE(opcao);
			break;
		}
		case 4: {
			System.out.println("Ponto de coleta Y senecionado, novas funcionalidades em desenvolvimento");
			break;
		}
		
		case 5: {
			System.out.println("Ponto de coleta x senecionado, novas funcionalidades em desenvolvimento");
			break;
		}
		
		case 6: {
			System.out.println("Ponto de coleta j senecionado, novas funcionalidades em desenvolvimento");
			break;
		}
		
		case 7: {
			System.out.println("Ponto de coleta u senecionado, novas funcionalidades em desenvolvimento");
			break;
		}
		default:
			System.out.println("Valor " + opcao + "invalido\n");
			mapa();
		}
		
	}
	
	public void qrCODE() {
		System.out.println("\nQR CODE\n\n");
		System.out.println(" _____ _      _ _____ \n"
						  +"|                    |\n"
						  +"|                    |\n"
						  +"                      \n"
						  +"                      \n"
						  +"                      \n"
						  +"|                    |\n"
						  +"|                    |\n"
						  +"|_____ _      _ _____|\n");
		
		printTRINDADE();
		int opcao = INPUT.nextInt();
		TRINDADE(opcao);
		
	}
	
	public void carloBOT() {
		int opcao = INPUT.nextInt();
		System.out.println("1- Notificações\n"
						 + "2- Chat bot\n"
						 + "3- Pontos favoritos\n"
						 + "4- Pontuação\n");
		
		switch (opcao) {
			case 1: { 
				System.out.println("\"Esse fenômeno é comumente associado ao processo de\"\n"
						+ "\"globalização, entretanto, o seu início pode estar vinculado à\"\n"
						+ "\"Grande Depressão de 1929\"\n");
				break;
			}
			
			case 2: {
				System.out.println("em desenvolvimento!");
				break;
			}
			
			case 3: {
				System.out.println("Pontos:\nx\ny\nj\nu");
				break;
			}
			
			case 4: {
				System.out.println("em desenvolvimento!");
				break;
			}
			default:
				System.out.println("Valor " + opcao + "invalido\n");
				carloBOT();
		}
		
	}
 
}
