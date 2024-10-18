package cursoJava2024;

public class Cap8_Lab2 {

	public static void main(String[] args) {
		//Verifica se o tamanho do array args é maior que zero
		if (args.length > 0) {
			//Inicializa a variável soma
			int soma = 0;
			//Laço for para interar nos elementos do array
			for(int i = 0; i < args.length; i++) {
				soma += Integer.parseInt(args[i]);
			}
			//Calcula média 
			double media = (double) soma / args.length;
			//Exibe o resultado da média 
			System.out.printf("A média das idades é: %.2f%n", media);
		} else {
			// Mensagem de erro se não houver argumentos
			System.out.println("Entre com valores válidos para as idades");
		}
	}

}
