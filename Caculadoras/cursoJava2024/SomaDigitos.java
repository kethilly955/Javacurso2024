package cursoJava2024;

import java.util.Scanner;

public class SomaDigitos {

	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite um número inteiro: ");
      int numero = scanner.nextInt();
      int soma = 0;
    		numero = Math.abs(numero);
      while(numero > 0) {
    	  soma += numero % 10;
    	  numero /= 10;
      }
  System.out.print("A soma do dígito é:" + soma);
	}

}
