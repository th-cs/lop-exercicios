// Cria dois vetores com 5 números inteiros aleatórios entre 1 e 10 cada.
// Compara os elementos na mesma posição e escreve quais são iguais
public class Ex07CompararVetores {
	public static void main(String[] args) {
		int[] valoresA = new int[5];
		int[] valoresB = new int[5];
		boolean valorIgual = false;

		System.out.println("-- Comparar elementos de vetores --\n");

		for (int i = 0; i < valoresA.length; i++) {
			valoresA[i] = (int)(Math.random() * 10 + 1);
			valoresB[i] = (int)(Math.random() * 10 + 1);
			if (valoresA[i] == valoresB[i]) {
				valorIgual = true;
			}
		}

		System.out.print("Vetor A: ");

		for (int k : valoresA) {
			System.out.print(k + " ");
		}

		System.out.print("\nVetor B: ");

		for (int l : valoresB) {
			System.out.print(l + " ");
		}

		if (valorIgual == true) {
			System.out.println("\n\nNúmeros iguais na mesma posição:\n");

			for (int c = 0; c < valoresA.length; c++) {
				if (valoresA[c] == valoresB[c]) {
					System.out.printf("Posição %d: %d\n", c, valoresA[c]);
				}
			}
		} else {
			System.out.println("\n\nNão há nenhum elemento igual na mesma "
				+ "posição");
		}
	}
}
