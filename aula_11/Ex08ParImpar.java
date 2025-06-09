// Cria um vetor com 10 números inteiros aleatórios entre 1 e 50 e separa os
// elementos pares e ímpares em dois novos vetores
public class Ex08ParImpar {
	public static void main(String[] args) {
		int[] valores = new int[10];
		int[] valoresPares = new int[10], valoresImpares = new int[10];

		System.out.println("-- Separar elementos pares e ímpares --\n");

		System.out.print("Vetor original: ");

		for (int i = 0; i < valores.length; i++) {
			valores[i] = (int)(Math.random() * 50 + 1);
			System.out.print(valores[i] + " ");
			if (valores[i] % 2 == 0) {
				valoresPares[i] = valores[i];
			} else {
				valoresImpares[i] = valores[i];
			}
		}

		System.out.print("\n\nNúmeros pares: ");

		for (int k : valoresPares) {
			if (k != 0) {
				System.out.print(k + " ");
			}
		}

		System.out.print("\nNúmeros ímpares: ");

		for (int l : valoresImpares) {
			if (l != 0) {
				System.out.print(l + " ");
			}
		}

		System.out.println();
	}
}
