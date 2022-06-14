package perfil;

//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.regex.Pattern;

public class Validador {
	
	public boolean isValidPass (String pass){
		if (pass.length() >= 5){
			for(int i = 0; i < pass.length(); i++){
				if (pass.charAt(i) >= 65 && pass.charAt(i) <= 90){
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isValidEmail (String email) {
		String regexPattern = "^(.+)@(\\S+)$";
		Boolean temp = Pattern.compile(regexPattern).matcher(email).matches();
		return temp;
	}
	
	public boolean isValidDate (int day, int month, int year) {
		LocalDate data = LocalDate.now();
		int dia = day;
		int mes = month;
		int ano = year;
		
		if (ano > data.getYear()) {
			return false;
		}
		else if (ano == data.getYear()) {
			
			if (mes > data.getMonthValue()) {
				return false;
			}
			else if (mes == data.getMonthValue()) {
				
				if (dia > data.getDayOfMonth()) {
					return false;
				}
			}
			
		}
		
		return true;
	
	}
	
	// Deve ser alterado
	public boolean isValidName(String nome) {
		if (nome == "") {
			return false;
		}
		return true;
		
	}
	
	public boolean isValidPhone(String telefone) {
	   telefone = telefone.replaceAll("\\D","");
	   
	   if (!(telefone.length() >= 10 && telefone.length() <= 11)) return false;
	   if (telefone.length() == 11 && Integer.parseInt(telefone.substring(2, 3)) != 9) return false;
	   
	   java.util.regex.Pattern p = java.util.regex.Pattern.compile(telefone.charAt(0)+"{"+telefone.length()+"}");
	   java.util.regex.Matcher m = p.matcher(telefone);
	   if(m.find()) return false;
	   Integer[] codigosDDD = {
	       11, 12, 13, 14, 15, 16, 17, 18, 19,
	       21, 22, 24, 27, 28, 31, 32, 33, 34,
	       35, 37, 38, 41, 42, 43, 44, 45, 46,
	       47, 48, 49, 51, 53, 54, 55, 61, 62,
	       64, 63, 65, 66, 67, 68, 69, 71, 73,
	       74, 75, 77, 79, 81, 82, 83, 84, 85,
	       86, 87, 88, 89, 91, 92, 93, 94, 95,
	       96, 97, 98, 99};
	   if ( java.util.Arrays.asList(codigosDDD).indexOf(Integer.parseInt(telefone.substring(0, 2))) == -1) return false;
	   Integer[] prefixos = {2, 3, 4, 5, 7};
	   
	   if (telefone.length() == 10 && java.util.Arrays.asList(prefixos).indexOf(Integer.parseInt(telefone.substring(2, 3))) == -1) return false;
	   return true;
	}
	
	


}
