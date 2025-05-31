// Lê 4 valores inteiros e escreve os resultados das adições e multiplicações de
// todas as combinações entre eles utilizando a lógica da propriedade distributiva
import java.util.Scanner;

public class ExGDistributiva {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaração das variáveis
		int a, b, c, d;
		int somaAB, somaAC, somaAD, somaBC, somaBD, somaCD;
		int multAB, multAC, multAD, multBC, multBD, multCD;

		System.out.println("-- Adições e multiplicações entre 4 variáveis --\n");

		// Entrada das informações
		System.out.print("Olá, digite o valor da variável A: ");
		a = input.nextInt();
		System.out.print("Digite o valor da variável B: ");
		b = input.nextInt();
		System.out.print("Digite o valor da variável C: ");
		c = input.nextInt();
		System.out.print("Digite o valor da variável D: ");
		d = input.nextInt();

		// Cálculo
		somaAB = a + b;
		somaAC = a + c;
		somaAD = a + d;
		somaBC = b + c;
		somaBD = b + d;
		somaCD = c + d;

		multAB = a * b;
		multAC = a * c;
		multAD = a * d;
		multBC = b * c;
		multBD = b * d;
		multCD = c * d;

		// Saída
		System.out.printf("\nAdições:"
			+ "\n1ª adição (A + B): %d + %d = %d"
			+ "\n2ª adição (A + C): %d + %d = %d"
			+ "\n3ª adição (A + D): %d + %d = %d"
			+ "\n4ª adição (B + C): %d + %d = %d"
			+ "\n5ª adição (B + D): %d + %d = %d"
			+ "\n6ª adição (C + D): %d + %d = %d", a, b, somaAB, a, c, somaAC,
			a, d, somaAD, b, c, somaBC, b, d, somaBD, c, d, somaCD);

		System.out.printf("\n\nMultiplicações:"
			+ "\n1ª multiplicação (A * B): %d * %d = %d"
			+ "\n2ª multiplicação (A * C): %d * %d = %d"
			+ "\n3ª multiplicação (A * D): %d * %d = %d"
			+ "\n4ª multiplicação (B * C): %d * %d = %d"
			+ "\n5ª multiplicação (B * D): %d * %d = %d"
			+ "\n6ª multiplicação (C * D): %d * %d = %d\n", a, b, multAB, a, c,
			multAC, a, d, multAD, b, c, multBC, b, d, multBD, c, d, multCD);

		input.close();
	}
}
