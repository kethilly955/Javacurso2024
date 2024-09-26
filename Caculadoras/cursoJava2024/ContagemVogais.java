package cursoJava2024;

import java.util.Scanner;

public class ContagemVogais {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine();
		int contadorVogais = 0;
		for (char c : frase.toLowerCase().toCharArray()) {
			if ("aeiou".indexOf (c)!=-1) {
				contadorVogais++;
				
			}
		}
		System.out.println("A frase contém " + contadorVogais + " vogais.");

	}

}
