// Lê dois números inteiros, calcula a multiplicação deles e escreve o resultado na tela
import java.util.Scanner;

public class Multiplicacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declaração das variáveis
		int fator1, fator2, produto;

		// Entrada das informações
		System.out.print("Olá, digite o primeiro número da multiplicação: ");
		fator1 = sc.nextInt();
		System.out.print("Agora digite o segundo número da multiplicação: ");
		fator2 = sc.nextInt();

		// Processamento
		produto = fator1 * fator2;

		// Saída
		System.out.println("O produto de " + fator1 + " x " + fator2
		                 + " é " + produto);

		sc.close();
	}
}
