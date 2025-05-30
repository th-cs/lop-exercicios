// Lê dois valores, um para a variável A e outro para
// a variável B. Troca esses valores entre si e os
// escreve na tela
import java.util.Scanner;

public class ExFTrocaVariaveis {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declaração das variáveis
		int a, b, c;

		System.out.println("-- Troca de valores entre variáveis --\n");
		
		// Entrada das informações
		System.out.print("Digite o valor da variável A: ");
		a = input.nextInt();
		System.out.print("Digite o valor da variável B: ");
		b = input.nextInt();
		
		// Saída 1
		System.out.printf("\nValores digitados:\nA: %d\nB: %d\n", a, b);
		
		// Cálculo
		c = a;
		a = b;
		b = c;
		
		// Saída 2
		System.out.printf("\nValores trocados:\nA: %d\nB: %d\n", a, b);

		input.close();
	}
}