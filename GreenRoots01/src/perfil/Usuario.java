package perfil;

import java.util.Date;

public class Usuario {

	private String nome;
	private Date nascimento;
	private String email;
	private String telefone;
	private String senha;
	
	public Usuario(String nome, Date nascimento, String email, String telefone, String senha) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
}
