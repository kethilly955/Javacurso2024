package cursoJava2024;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		
	        // Passo 2: Declarando a variável 'numero' e recebendo o valor do usuário
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite para verificar se o numero é primo: ");
	        int numero = scanner.nextInt();

	        // Passo 4: Verificando se o número é primo
	        if (numero <= 1) {
	            System.out.print(numero + " não é um numero primo");
	        } else {
	            boolean ehPrimo = true;
	            // Considera-se que o número é primo até que se prove o contrário
	            for (int i = 2; i <= Math.sqrt(numero); i++) {
	                if (numero % i == 0) {
	                    ehPrimo = false;
	                    // O número tem um divisor além de 1 e ele mesmo
	                    break;
	                }
	            }
	            // Fechando o if statement
	            if (ehPrimo) {
	                System.out.println(numero + " é um número primo");
	            } else {
	                System.out.println(numero + " não é um número primo");
	            }
	        }

	        // Fechando o Scanner
	        scanner.close();
	    }
	}