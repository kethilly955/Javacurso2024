package cursoJava2024;

import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a hora (0 a 23):");
		
     int hora = scanner.nextInt();
		
		switch(hora) {
		case 0,1,2,3,4,5:
			System.out.println("Madrugada");
			break;
		case 6,7,8,9,10:
			System.out.println("Bom dia");
			break;
		case 12,13,14,15,16:
			System.out.println("Boa tarde");
			break;
		case 18,19,20,21,22,23:
			System.out.println("Boa norde");
			break;
			
			default:
				System.out.println("Indisponivel");


	}
	}
}

