package cursoJava2024;

import java.util.Scanner;

public class ClasseComMetados {
	// Metado 01: calcula a somna de 2 numeros:
	public int soma (int a, int b ) {
		return a + b ;
	}
		//Metado 02: Verificar se 1 numero é par 
		public boolean ehPar(int numero ) {
			return numero % 2 == 0;
		}
		// Método 3: Inverte uma string
		public static String inverteString(String str) {
		    StringBuilder sb = new StringBuilder(str);
		    return sb.reverse().toString();
		}

	public static void main(String[] args) {
		// Instanciando a classe:
		ClasseComMetados utilidades = new ClasseComMetados();

		// Chamando os metódos:
		System.out.println("A soma de 200 e 15  é: " + utilidades.soma(200, 15));
		System.out.println("O numero 15 é par?: " + utilidades.ehPar(17));

	}
}
