package cursoJava2024;

import java.util.Scanner;

public class ParouÍmpar {

	public static void main(String[] args) {
	Scanner scanner= new Scanner (System.in);
	// Inicializa o Scanner para receber a entrada do usuário
	 System.out.println("Digidi um numero inteito");
	 // Solicita que o usuário digite um número
	 int numero = scanner.nextInt();
	// Lê o número inteiro fornecido pelo usuário
	 if (numero % 2 == 0) {
		    System.out.println(numero + " é par.");
		} else {
		    System.out.println(numero + " é ímpar.");
		}
	 scanner.close();
	}

}
