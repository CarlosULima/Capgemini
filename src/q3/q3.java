package q3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		// chamando o teclado do usuario
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um anagrama: ");
		// a chamada da classe de substring recebendo o possivel anagram
		subString(sc.next());
		// fechando o scanner
		sc.close();
	}

	/**
	 * 
	 * @param anagrama
	 */
	static void subString(String s) {
		HashMap<String, Integer> map = new HashMap<>();

		// array para percorrer a palavra
		for (int i = 0; i < s.length(); i++) {
			// array para percorrer a substring
			for (int j = i; j < s.length(); j++) {
				// pegando a posição do array e obtendo a substring
				char[] sub = s.substring(i, j + 1).toCharArray();
				// ordenando string
				Arrays.sort(sub);
				// pegando o array de caracteres e passando para uma string
				String valor = new String(sub);

				// se no map existe o valor da string atualiza a quantidade de vezes
				if (map.containsKey(valor)) {
					map.put(valor, map.get(valor) + 1);
				// se não existe adiciona a chave e coloca 1 para q quantidade de vezes
				} else {
					map.put(valor, 1);
				}
			}
		}
		int contador = 0;
		// para cada chave conta a quantidade de vezes pelo calculo de pares
		for (String key : map.keySet()) {
			int n = map.get(key);
			contador += (n * (n - 1)) / 2;
		}
		// retornar a quantidade de pares
		System.out.println(contador);
	}
}
