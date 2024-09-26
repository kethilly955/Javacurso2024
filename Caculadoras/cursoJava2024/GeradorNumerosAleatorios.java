package cursoJava2024;

import java.util.Random;

public class GeradorNumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("Números aleatórios gerados:");
		for (int i = 0; i < 5; i++) {
			int numeroAleatorio = random.nextInt(1000) + 1;
			System.out.println(numeroAleatorio);
		}

	}

}
