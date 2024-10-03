package cursoJava2024;
import java.util.Scanner;

public class IMCCaculadora {

	private static double peso;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Entrada de dados: peso e altura
		System.out.println("Digite o seu peso em kg:");
		double peso = sc.nextDouble();
		System.out.println("Digite a sua altura em metros:");
		double altura = sc.nextDouble();
		// Cálculo do IMC
		double imc = peso / (altura * altura);
		// Exibe o resultado do IMC
		System.out.println("O seu IMC é:"+ imc);
		if(imc< 18.5 ) {
			System.out.println("Classificação: Peso normal");
		}else {
			if(imc>25 && imc<29.9 ) {
				System.out.println("Classificação: Sobrepeso");
			} else {
				System.out.println("Classificação: Obesidade");
			}
		}

	}

}
