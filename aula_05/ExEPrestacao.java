// Lê o valor, taxa e tempo de atraso de um bem e calcula o valor da prestação
import java.util.Scanner;

public class ExEPrestacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaração das variáveis
		double valor, taxa, tempoAtraso, prestacao;

		System.out.println("-- Cálculo de prestação --\n");

		// Entrada das informações
		System.out.print("Olá, digite o valor do bem em atraso: R$ ");
		valor = input.nextDouble();
		System.out.print("Qual é a taxa de atraso (porcentagem): ");
		taxa = input.nextDouble();
		System.out.print("Por quantos dias esses bem está em atraso? ");
		tempoAtraso = input.nextDouble();

		// Cálculo
		prestacao = valor + (valor * (taxa / 100) * tempoAtraso);

		// Saída
		System.out.printf("\nO valor da prestação devida é de R$ %.2f\n",
			prestacao);

		input.close();
	}
}
