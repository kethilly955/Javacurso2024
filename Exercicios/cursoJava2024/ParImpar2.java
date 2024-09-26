package cursoJava2024;

import java.util.Scanner;

public class ParImpar2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println( "Digide um numero:");
		int numero = scanner.nextInt();
		if( numero % 2 == 0 ) {
			System.out.println("Esse é um numero par!");
		} else {
			System.out.println("Esse é um numero impar!");
		}

	}

}
