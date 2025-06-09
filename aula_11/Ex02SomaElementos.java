// Cria um vetor com 10 números inteiros
// aleatórios entre 1 e 100, soma todos
// eles e escreve o resultado na tela
public class Ex02SomaElementos {
	public static void main(String[] args) {
		int[] valores = new int[10];
		int soma = 0;

		System.out.println("-- Soma dos elementos de um vetor --\n");

		for (int i = 0; i < valores.length; i++) {
			valores[i] = (int)(Math.random() * 100 + 1);
			soma += valores[i];
		}

		System.out.print("Números gerados: ");

		for (int k : valores) {
			System.out.print(k + " ");
		}

		System.out.printf("\nSoma total: %d\n", soma);
	}
}
