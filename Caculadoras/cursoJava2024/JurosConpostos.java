package cursoJava2024;
import java.util.Scanner;
public class JurosConpostos {

	public static void main(String[] args) {
		//Intanciando uma classe para usá-la:
		Scanner sc = new Scanner(System.in);
		
		//Entradas do usuário:
		//Pegando o capital inicial:
		System.out.println("Digite o capital: ");
		double capital = sc.nextDouble();
		
		//Pedando a taxa de juros:
		System.out.println("Qual a taxa de juros:");
		double taxa = sc.nextDouble();
		
		//Pegando o tempo:
		System.out.println("Digite o tempo em anos: ");
		 int tempo = sc.nextInt();
		 
		 //Calculando os juros compostos:
		 double montante = capital * Math.pow(1+ (taxa/100), tempo);
		 //Saida final:
		 System.out.println("O montante final sera de R$" + montante);
		 sc.close();
	}

}
