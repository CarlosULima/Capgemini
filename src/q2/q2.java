package q2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class q2 {

	// REGEX para validar a senha completa
	private static final String REGEX_TOTAL = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()\\-+])[A-Za-z\\d!@#$%^&*()\\-+]{6,}$";

	// REGEX para validar somente numeros
	private static final String REGEX_NUM = "^[0-9]*$";

	// REGEX para validar somente maiusculos
	private static final String REGEX_MAIUSCULO = "^[A-Z]*$";

	// REGEX para validar somente minusculos
	private static final String REGEX_MINUSCULO = "^[a-z]*$";

	// REGEX para validar somente especiais
	private static final String REGEX_ESPECIAL = "^[!@#$%^&*()\\-+]*$";

	/**
	 * 
	 * @param s senha do usuario
	 * @return se a senha forte
	 */
	private static boolean validadorSenhaForte(String s) {
		// chamada do patterns recebendo o regex e comparando de dar match e retornando
		// um boolean
		return Pattern.compile(REGEX_TOTAL).matcher(s).matches();
	}

	/**
	 * 
	 * @param s senha do usuario
	 * @return se a string tem numeros
	 */
	private static boolean validadorSomenteNumeros(String s) {
		// chamada do patterns recebendo o regex e comparando de dar match e retornando
		// um boolean
		return Pattern.compile(REGEX_NUM).matcher(s).matches();
	}

	/**
	 * 
	 * @param s senha do usuario
	 * @return se a string tem caracteres maiusculo
	 */
	private static boolean validadorSenhaMaiusculo(String s) {
		// chamada do patterns recebendo o regex e comparando de dar match e retornando
		// um boolean
		return Pattern.compile(REGEX_MAIUSCULO).matcher(s).matches();
	}

	/**
	 * 
	 * @param s senha do usuario
	 * @return se a string tem caracteres minusculos
	 */
	private static boolean validadorSenhaMinusculo(String s) {
		// chamada do patterns recebendo o regex e comparando de dar match e retornando
		// um boolean
		return Pattern.compile(REGEX_MINUSCULO).matcher(s).matches();
	}

	/**
	 * 
	 * @param s senha do usuario
	 * @return se a string tem caracteres especiais
	 */
	private static boolean validadorSenhaEspecial(String s) {
		// chamada do patterns recebendo o regex e comparando de dar match e retornando
		// um boolean
		return Pattern.compile(REGEX_ESPECIAL).matcher(s).matches();
	}

	public static void main(String[] args) {
		// chamando o teclado do usuario
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira uma senha forte!");
		// recebendo a senha
		String senha = sc.next();
		// validando senha
		if (validadorSenhaForte(senha)) {// a3dfa3Asd+-
			System.out.println("Sua senha é forte");
		} else {

			String s = senha.replaceAll("[^0-9]", "");

			if (!validadorSomenteNumeros(s) || s.isEmpty()) {
				System.out.println("Insira numeros");
			}

			s = senha.replaceAll("[^A-Z]", "");

			if (!validadorSenhaMaiusculo(s) || s.isEmpty()) {
				System.out.println("Insira maiusculo");
			}

			s = senha.replaceAll("[^a-z]", "");

			if (!validadorSenhaMinusculo(s) || s.isEmpty()) {
				System.out.println("Insira minusculos");
			}

			s = senha.replaceAll("[^!@#$%^&*()\\-+]", "");

			if (!validadorSenhaEspecial(s) || s.isEmpty()) {
				System.out.println("Insira caracteres especiais");
			}

			if (senha.length() < 6) {
				System.out.println("Faltam: " + (6 - senha.length()) + " caracteres para o minimo de uma senha forte");
			}
		}

		sc.close();
	}
}
