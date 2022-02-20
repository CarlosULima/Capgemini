package q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o
		// caractere * e espaços.
		// A base e altura da escada devem ser iguais ao valor de n. A última linha não
		// deve conter nenhum espaço.

		Scanner sc = new Scanner(System.in);
		List<String> escada = new ArrayList<>();
		System.out.print("Digite a quantidade de vezes: ");

		int degrau = sc.nextInt();
		sc.close();

		for (int i = 0; i < degrau; i++) {
			escada.add(" ".repeat(degrau - (i+1)) + "*".repeat(i + 1));
		}

		for (String d : escada) {
			System.out.println(d);
		}

	}

}