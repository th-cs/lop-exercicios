// Simula um caixa eletrônico. A pessoa pode
// realizar saques, depósitos e consulta do
// saldo
import java.util.Scanner;

public class Ex8CaixaEletronico {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double saldo = 0;
		double saque, deposito;
		int opcao;
		boolean menu = true;

		System.out.println("-- Caixa eletrônico --\n");

		System.out.println("Olá, como posso te ajudar?");

		while (menu == true) {
			System.out.println("Escolha uma das opções e pressione 'Enter'\n"
				+ "[ 1 ] - Consultar o saldo da conta\n"
				+ "[ 2 ] - Relizar um depósito\n"
				+ "[ 3 ] - Realizar um saque\n"
				+ "[ 4 ] - Sair da conta");
			opcao = input.nextInt();

			if (opcao == 1) {
				System.out.printf("O saldo da sua conta é de R$ %.2f\n\n",
					saldo);
			} else if (opcao == 2) {
				System.out.print("Digite o valor a ser depositado na conta: ");
				deposito = input.nextDouble();

				if (deposito > 0) {
					saldo += deposito;
					System.out.printf("O seu novo saldo é de R$ %.2f\n\n",
						saldo);
				} else if (deposito == 0) {
					System.out.println("Você tem que digitar algum valor\n");
				} else {
					System.out.printf("R$ %.2f não é um valor válido\n\n",
						deposito);
				}
			} else if (opcao == 3) {
				System.out.print("Digite o valor a ser sacado da conta: ");
				saque = input.nextDouble();

				if (saldo >= saque && saque > 0) {
					saldo -= saque;
					System.out.printf("O seu novo saldo é de R$ %.2f\n\n",
						saldo);
				} else if (saldo < saque) {
					System.out.println("Saldo insuficiente para realizar essa "
						+ "operação\n");
				} else if (saque == 0) {
					System.out.println("Você tem que digitar algum valor\n");
				} else {
					System.out.printf("R$ %.2f não é um valor válido\n\n",
						saque);
				}
			} else if (opcao == 4) {
				System.out.println("Saindo da conta...");
				menu = false;
			} else {
				System.out.printf("%d não é uma opção válida. São aceitos "
					+ "apenas números entre 1 e 4\n\n", opcao);
			}
		}

		input.close();
	}
}
