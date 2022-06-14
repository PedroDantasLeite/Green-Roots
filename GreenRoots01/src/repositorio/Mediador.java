package repositorio;

import perfil.Usuario;
import perfil.Validador;

public class Mediador {
	Repository rep = new Repository();
	Validador val = new Validador();
	
	public Mediador() {}
	
	public Usuario login(String acc, String pass) {
		
		Usuario conta = rep.login(acc, pass);
		
		if (conta != null) {
			return conta;
			
		}
		
		return null;
		
	}
	
	public boolean cadastro(String nome, int dia, int mes, int ano, String email, String cell, String senha) {
		
		boolean mailV = val.isValidEmail(email);
		boolean cellV = val.isValidPhone(cell);
		boolean dataV = val.isValidDate(dia, mes, ano);
		boolean nameV = val.isValidName(nome);
		boolean passV = val.isValidPass(senha);
		
		if (!mailV) {
			System.out.println("E-mail invalido!");
			return false;
		}
		
		if (!cellV) {                                                
			System.out.println("Telefone invalido! formato correto ex: 819******** ");
			return false;
		}
		
		if (!dataV) {
			System.out.println("Data de nascimento invalida!");
			return false;
		}
		
		if (!nameV) {
			System.out.println("Nome invalido!");
			return false;
		}
		
		if (!passV) {
			System.out.println("Senha invalida!");
			return false;
		}
		
		Usuario acc = new Usuario(nome, dia, mes, ano, email, cell, senha);
		
		if (rep.addConta(acc)) {
			System.out.println("Conta adicionada com sucesso!");
			
		}
		else {
			System.out.println("Conta ja adicionada!");
		}
		
		return true;
		
	}
	
	public void perfil (Usuario conta) {
		rep.printPerfil(conta);
		
	}
	
	public boolean alteraSenha(Usuario conta, String senhaAtual, String novaSenha){
		if (rep.comparaSenha(conta, senhaAtual)){
			if(val.isValidPass(novaSenha)){
				rep.alteraSenha(conta, novaSenha);
				return true;
			}
			else {
				System.out.println("Nova senha incorreta! Formato correto: Maior que 5 caracteres e pelo menos uma maiúscula");
				return false;
			}
		}
		System.out.println("Senha atual incorreta");
		return false;
	}
	
	public boolean alteraNome(Usuario conta, String nome, String senha){
		if (rep.comparaSenha(conta, senha)){
			if(val.isValidName(nome)){
				rep.alteraNome(conta, nome);
				return true;
			}
			else {
				System.out.println("Nome invalido!");
				return false;
			}
		}
		System.out.println("Senha incorreta");
		return false;
	}
	
	
}
