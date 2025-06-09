// Cria um vetor com 8 números inteiros e
// escreve na tela o maior e o menor
// valor armazenado
import java.util.Scanner;

public class Ex03MaiorMenorValor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] valores = new int[8];
		int maiorValor, menorValor;

		System.out.println("-- Maior e menor elemento de um vetor --\n");

		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Digite o %dº elemento do vetor: ", i + 1);
			valores[i] = input.nextInt();
		}

		maiorValor = valores[0];
		menorValor = valores[0];

		for (int k = 1; k < valores.length; k++) {
			if (valores[k] >= maiorValor) {
				maiorValor = valores[k];
			} else if (valores[k] <= menorValor) {
				menorValor = valores[k];
			}
		}

		System.out.print("\nVetor: ");

		for (int l : valores) {
			System.out.print(l + " ");
		}

		System.out.printf("\n\nMaior número: %d\n", maiorValor);
		System.out.printf("Menor número: %d\n", menorValor);

		input.close();
	}
}
