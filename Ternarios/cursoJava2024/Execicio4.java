package cursoJava2024;

import java.util.Scanner;

public class Execicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite o primeiro número:");
		int num1 = scanner.nextInt();
		System.out.println("Digite o segundo número:");
		int num2 = scanner.nextInt();
		int maior = (num1 > num2) ? num1 : num2;
		System.out.print("O maior número é :"  + maior);
	}
}
