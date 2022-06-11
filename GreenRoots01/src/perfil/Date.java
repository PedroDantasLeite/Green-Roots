package perfil;

public class Date {
	private int dia;
	private int mes;
	private int ano;

	public Date(int day, int month, int year) {
		this.dia = day;
		this.mes = month;
		this.ano = year;
		
	}
	
	public int getDia () {
		return this.dia;
	}
	
	public int getMes () {
		return this.mes;
	}
	
	public int getAno () {
		return this.ano;
	}
}
