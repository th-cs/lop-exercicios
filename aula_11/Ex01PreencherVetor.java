// Lê 5 números inteiros, coloca-os em um
// vetor e depois escreve-os na tela
import java.util.Scanner;

public class Ex01PreencherVetor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] valores = new int[5];

		System.out.println("-- Preencher vetor --\n");

		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Digite o %dº número do vetor: ", i + 1);
			valores[i] = input.nextInt();
		}

		System.out.print("Números armazenados: ");

		for (int k: valores) {
			System.out.print(k + " ");
		}

		System.out.println();

		input.close();
	}
}
