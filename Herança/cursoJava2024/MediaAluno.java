package cursoJava2024;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		//Criar um scanner para litura de dados
		Scanner scanner = new Scanner(System.in);
		//Variaveis para armazenar notas
		double nota1, nota2, nota3, nota4, media;
		//Solicitação e leitura das notas  bimestres
		System.out.println("Digite a nota do 1 bimestre: ");
		nota1 = scanner.nextDouble();
		System.out.println("Digite a nota do 2 bimestre: ");
		nota2 = scanner.nextDouble();
		System.out.println("Digite a nota do 3 bimestre: ");
		nota3 = scanner.nextDouble();
		System.out.println("Digite a nota do 4 biomestre: ");
		nota4 = scanner.nextDouble();
		
		 media=nota1+ nota2+ nota3+ nota4;
		//Exibir da media final:
		System.out.println("A media final: %.2f%n" + media );
		//Verificar se o aluno foi aprovando ou reprovado
		if(media >= 6.0) {
			System.out.println("O aluno foi APROVADO COM SUCESSO!");
		} else {
			
		if(media <= 6.0) {
			System.out.println("O aluno foi REPROVANDO, TENTE ANO QUE VEM ");
			
		}
		}
		scanner.close();
		

	}

	private static void media(double d) {
		// TODO Auto-generated method stub
		
	}

}
