package repositorio;

import perfil.Usuario;
import perfil.Validador;
import perfil.Date;

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
	
	public void cadastro(String nome, Date nas, String email, String cell, String senha) {
		
		boolean mailV = val.isValidEmail(email);
		boolean cellV = val.isValidPhone(cell);
		boolean dataV = val.isValidDate(nas);
		boolean nameV = val.isValidName(nome);
		boolean passV = val.isValidName(senha);
		
		if (!mailV) {
			System.out.println("E-mail invalido!");
			return;
		}
		
		if (!cellV) {
			System.out.println("Telefone invalido!");
			return;
		}
		
		if (!dataV) {
			System.out.println("Data de nascimento invalida!");
			return;
		}
		
		if (!nameV) {
			System.out.println("Nome invalido!");
			return;
		}
		
		if (!passV) {
			System.out.println("Senha invalida!");
			return;
		}
		
		Usuario acc = new Usuario(nome, nas, email, cell, senha);
		
		if (rep.addConta(acc) == 1) {
			System.out.println("Conta adicionada com sucesso!");
		}
		else {
			System.out.println("Conta ja adicionada!");
		}
		
	}
	
	
}
