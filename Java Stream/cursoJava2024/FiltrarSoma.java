package cursoJava2024;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FiltrarSoma {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
		// Usando reduce para calcular a soma de todos os números
		Optional<Integer> soma = numeros.stream().reduce((a, b) -> a + b);
		// Exibindo o resultado
		if (soma.isPresent()) {
			System.out.println("Soma é: " + soma.get());
		} else {
			System.out.println("A lista está vazía. ");

		}

	}

}
