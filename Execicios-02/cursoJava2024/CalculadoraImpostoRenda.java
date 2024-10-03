package cursoJava2024;
import java.util.Scanner;

public class CalculadoraImpostoRenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Entrada de dados: salário bruto
		System.out.println("Digite o seu salário bruto: R$");
		double salarioBruto = sc.nextDouble();
		// Variáveis para armazenar a alíquota e a parcela a deduzir
		double aliquota = 0;
		double deducao = 0;
		// Verificar a faixa salarial e definir a alíquota e dedução
		if (salarioBruto <=2826.65) {
			System.out.println("Você está isento de Imposto de Renda");
			return;
		} else {
		if (salarioBruto <= 2826.65) {
            aliquota = 0.075;
            deducao = 158.40;
        } else {
        	if (salarioBruto <= 3751.05) {
            aliquota = 0.15;
            deducao = 370.40;
        } else {
        	if (salarioBruto <= 4664.68) {
            aliquota = 0.225;
            deducao = 651.73;
        } else {
            aliquota = 0.275;
            deducao = 884.96;
        }
        
        // Cálculo do imposto de renda
        double imposto = (salarioBruto * aliquota) - deducao;
        
        // Exibição do resultado
        System.out.printf("O imposto de renda a ser pago é: R$ %.2f\n", imposto);
        
        sc.close();
    }
}
		}		

	}

}
