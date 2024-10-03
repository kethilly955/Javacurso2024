package cursoJava2024;

import java.util.Scanner;

public class AnosDeCopaDoMundo {

    public static void main(String[] args) {
        // Criar um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Perguntar ao usuário para inserir o ano atual
        System.out.println("Digite o ano atual:");
        int anoAtual = scanner.nextInt();

        // Inicializar a variável ano com o valor 1930
        for (int ano = 1930; ano <= anoAtual; ano += 4) {
            // Verificar se o ano é 1942 ou 1946 e pular para o próximo ano
            if (ano == 1942 || ano == 1946) {
                continue;
            }

            // Imprimir o ano de copa do mundo
            System.out.println(ano);
        }

        // Fechar o Scanner
        scanner.close();
    }
}