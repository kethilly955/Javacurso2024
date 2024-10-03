package cursoJava2024;

import java.util.Scanner;

public class CalculadoraIAC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Entrada de dados: altura e circunferência da cintura
		System.out.println("Digite a sua altura:");
		double altura = sc.nextDouble();
		System.out.println("Digite a circunferência da sua cintura em centímetros:");
		double cintura = sc.nextDouble();
		// Cálculo do IAC
		double iac = (cintura * 0.74) / altura - 3.2;
		// Exibe o resultado do IAC
		System.out.println("O seu iac é:" + iac);
		// Classificação do IAC
		if (iac < 6) {
			System.out.println("Classificação: Baixo");
		} else {
			if (iac >= 6 && iac < 11) {
				System.out.println("Classificação: Normal");
			} else {
				if (iac >= 11 && iac < 16) {
					System.out.println("Classificação: Alto");
				} else {

				}
			}
		}

	}

}
