package perfil;

public class Usuario extends Date{

	private String nome;
	private String email;
	private String telefone;
	private String senha;
	
	public Usuario(String nome, int dia, int mes, int ano, String email, String telefone, String senha) {
		super(dia, mes, ano);
		this.nome = nome;
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
