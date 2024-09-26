package cursoJava2024;

import java.util.Scanner;

public class VerificaVoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo a idade da pessoa
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        // Verificando se pode ou não votar
        if (idade < 16) {
            System.out.println("Você ainda não pode votar.");
        } else if (idade >= 18 && idade <= 70) {
            System.out.println("O voto é obrigatório para você.");
        } else {
            System.out.println("O voto é facultativo para você.");
        }

        scanner.close();
    }
}
