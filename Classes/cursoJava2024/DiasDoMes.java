package cursoJava2024;

import java.util.Scanner;

public class DiasDoMes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 2. Declare uma variável do tipo String e armazene o nome de um mês
		System.out.println("Digite o nome do mês:");
		String mes = scanner.nextLine();
		// 3. Utilize uma estrutura de decisão múltipla switch
		switch (mes) {
		case "Janeiro":
		case "Março":
		case "Maio":
		case "Julho":
		case "Agosto":
		case "Outubro":
		case "Dezembro":
			System.out.println("O mês escolhido tem 31 dias ");
			break;
		case "Fevereiro":
			System.out.println("O mês escolhido tem 28 dias ");
		case "Abril":
		case "Junho":
		case "Setembro":
		case "Novembro":
			System.out.println("O mês escolhido tem 30 dias ");
			break;
		default:
			System.out.println("Erro: Mês inexitente! ");
			break;
		
		
		}

	}

}
