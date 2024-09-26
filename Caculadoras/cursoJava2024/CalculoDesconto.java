package cursoJava2024;

import java.util.Scanner;

public class CalculoDesconto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço original do produto: ");
        double precoOriginal = sc.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double percentualDesconto = sc.nextDouble();

        double desconto = precoOriginal * (percentualDesconto / 100);
        double precoFinal = precoOriginal - desconto;

        System.out.printf("O preço final após o desconto é: R$ %.2f%n", precoFinal);
        
        sc.close();
    }
}
