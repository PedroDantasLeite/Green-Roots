package repositorio;

import perfil.Usuario;

public class Repository {
	
	private static final int MAX = 100;
	
	private Usuario[] Usuarios = new Usuario[MAX]; 
	private int tamanhoTOT = 0;
	
	public Repository () {
		
	}
	
	// Função para achar a conta passada, verifica 
	// se ela existe ou não, se sim, retorna o 
	// indice da mesma
	private int procuraConta(Usuario conta) {
		int valida = 0;
		int index = 0;
		
		for (int c=0; c<tamanhoTOT; c++) {
			
			if (Usuarios[c] == conta) {
				valida = 1;
				index = c;
			}
			
		}
		
		if (valida == 1) {
			return index;
		}
		
		else {
			return -1;
		}
		
	}
	
	// Adiciona a conta passada, antes verifica se 
	// a mesma ja existe, se não, a adiciona e 
	// incrementa +1 no tamanho do array
	public int addConta(Usuario conta) {
		
		if (procuraConta(conta) != 1) {
			
			for (int c=0; c<tamanhoTOT; c++) {
			
				if (Usuarios[c] == null) {
					Usuarios[c] = conta;
					break;
				}
			
			}
			tamanhoTOT++;
			return 1;
		}
		
		else {
			
			return -1;
			
		}
		
	}
	
	
	// Verifica se a senha digitada é a mesma da conta
	// recebida (conta), e retorna um boolean
	public boolean comparaSenha(Usuario conta, String pass) {
		int index = procuraConta(conta);
		
		if (index >= 0) {
			
			String UsrPass = Usuarios[index].getSenha();
			
			if (UsrPass == pass) {
				return true;
			}
			
			else {
				return false;
			}
			
		}
		
		else {
			System.out.println("A conta n�o existe!");
			return false;
		}
		
		
		
	}
	
	
	// Recebe o email e senha do usuario, e verifica
	// se o usuario existe, se sim, verifica a senha,
	// por fim, retorna a conta se tudo estiver correto
	public Usuario login(String email, String senha) {
		
		for (int c=0; c<tamanhoTOT; c++) {
			if (Usuarios[c].getEmail() == email) {
				
				if (Usuarios[c].getSenha() == senha) {
					System.out.println("Login efetuado com sucesso!");
					return Usuarios[c];
				}
				System.out.println("Senha incorreta!");
				return null;
				
			}
			
		}
		System.out.println("Usuario não encontrado!");
		return null;
		
	}
	
	// Deleta a conta recebida, se não achar ela
	// retorna false 
	public boolean deletaConta(Usuario conta) {
		int index = procuraConta(conta);
		
		if (index != -1) {
			Usuarios[index] = null;
			return true;
			
		}
		
		else {
			System.out.println("Essa conta não existe!");
			return false;
			
		}
		
		
	}
	
}
