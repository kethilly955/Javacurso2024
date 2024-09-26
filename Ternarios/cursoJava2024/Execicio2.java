package cursoJava2024;

import java.util.Scanner;

public class Execicio2 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digide o primeiro numero:");
	int num1 = scanner.nextInt();
	System.out.println("Digide o segundo numero agora:");
	int num2 = scanner.nextInt();
	int soma = (num1 >= 0 && num2 >= 0) ? (num1 + num2) : (num1 + num2);
	System.out.println("A soma é " +soma);
	
	}

}
