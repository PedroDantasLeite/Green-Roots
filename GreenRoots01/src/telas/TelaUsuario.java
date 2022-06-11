package telas;
import java.util.Scanner;

public class TelaUsuario {
	private static Scanner INPUT = new Scanner(System.in);
	
	public void entrar() {
		System.out.println("----  GREEN ROOTS  ----");
		System.out.println();
		
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
				+ "Debbie knew she was being selfish and unreasonable.\n"
				+ "She understood why the others in the room were angry and frustrated \n"
				+ "with her and the way she was acting. In her eyes, it didn't really\n"
				+ "matter how they felt because she simply didn't care.\n"
				+ "\n"
				+ "A two-inch layer of freshly fallen snow covered the yard.\n"
				+ "Stacey peeked outside. To most, it would have been a beautiful\n"
				+ "sight worthy of taking a photo to put on Instagram. For Stacey,\n"
				+ "it meant something different. The first snow of the year brought\n"
				+ "back the witches as the fairies in the yard had to seek shelter\n"
				+ "to avoid the cold.\n");
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
				
				break;
			}
			
			case 8: {
				
				break;
			}
			
			case 9: {
				br = 1;
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
				Tela();
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
		printTRINDADE();
		System.out.print("4- Editar perfil\n"
				+ "5- Pontos favoritos\n");
		int opcao = INPUT.nextInt();
		
		switch (opcao) {
		case 1,2,3: {
			TRINDADE(opcao);
			break;
		}
		
		case 4: {
			
			break;
		}
		case 5: {
				Tela();
			break;
		}
		default:
			
			System.out.println("Valor " + opcao + "invalido\n");
			perfil();
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
			break;
		}
		
		case 5: {
			
			break;
		}
		
		case 6: {
			
			break;
		}
		
		case 7: {
			
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
				
				break;
			}
			
			case 2: {
				
				break;
			}
			
			case 3: {
				
				break;
			}
			
			case 4: {
				
				break;
			}
		
		}
		
	}
 
}
