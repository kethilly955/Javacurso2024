package cursoJava2024;

public class MaiorNumero {

	public static int encontrarMaior(int[] array) {
		int maior = array[0]; 
	// Assume que o primeiro elemento é o maior

		for (int i = 1; i < array.length; i++) {
			if (array[i] > maior) {
				maior = array[i]; 
	// Atualiza o maior número
			}
		}
		return maior;
	// Retorna o maior número encontrado
	}

	public static void main(String[] args) {
		int[] numeros = { 3, 5, 7, 2, 8 };
		int maiorNumero = encontrarMaior(numeros); // Chama o método corretamente
		System.out.println("O maior número é: " + maiorNumero); // Exibe o resultado
	}
}
