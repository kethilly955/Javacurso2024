package cursoJava2024;

public class Main {

	public static void main(String[] args) {
		// Criação de uma conta com saldo inicial de R$1000
		ContaBancaria conta = new ContaBancaria(5000.00);
		// exibir o saldo inicial:
		System.out.println("Saldo Inicial:" + conta.getSaldo());
		// Realizando um deposkito de R$500,00
		conta.sacar(2500);
		System.out.println("Saldo:" + conta.getSaldo());
		conta.depositar(200);
		System.out.println("Saldo:" + conta.getSaldo());
	}
}