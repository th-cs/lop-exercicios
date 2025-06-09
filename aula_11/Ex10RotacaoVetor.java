// Cria um vetor com 5 números inteiros e rotaciona
// os elementos para a direita. O último elemento
// vai para a primeira posição
import java.util.Scanner;

public class Ex10RotacaoVetor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] valores = new int[5];
		int x;

		System.out.println("-- Rotacionar os elementos de um vetor --\n");

		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Digite o %dº elemento do vetor: ", i + 1);
			valores[i] = input.nextInt();
		}

		System.out.print("\nVetor original: ");

		for (int k : valores) {
			System.out.print(k + " ");
		}

		System.out.print("\nVetor rotacionado: ");

		x = valores[valores.length - 1];

		for (int c = valores.length - 1; c > 0; c--) {
			valores[c] = valores[c - 1];
		}

		valores[0] = x;

		for (int l : valores) {
			System.out.print(l + " ");
		}

		System.out.println();

		input.close();
	}
}
