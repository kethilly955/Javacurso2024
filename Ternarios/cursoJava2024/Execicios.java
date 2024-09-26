package cursoJava2024;

import java.util.Scanner;

public class Execicios {
 public static void main(String[] args) {
	
	 Scanner scanner = new Scanner (System.in);
	 
	 System.out.println("Fala um número:");
	int numero = scanner.nextInt() ;
	
	String resultado = (numero % 2 == 0) ? "Numero Par": "Numero Ímpar";
	System.out.println("O numero " +numero+ " é " +resultado);
     
}

	
}

