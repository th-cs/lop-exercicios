// Cria um vetor com 15 números inteiros aleatórios
// entre 1 e 50 e escreve na tela quantos deles são
// pares
public class Ex04ContarPares {
	public static void main(String[] args) {
		int[] valores = new int[15];
		int contagemPares = 0;

		System.out.println("-- Contagem de números pares em um vetor --\n");

		for (int i = 0; i < valores.length; i++) {
			valores[i] = (int)(Math.random() * 50 + 1);
			if (valores[i] % 2 == 0) {
				contagemPares += 1;
			}
		}

		System.out.print("Vetor: ");

		for (int k : valores) {
			System.out.print(k + " ");
		}

		System.out.printf("\nTotal de números pares: %d\n", contagemPares);
	}
}
