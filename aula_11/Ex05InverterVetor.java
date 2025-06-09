// Cria um vetor com 6 números inteiros aleatórios entre 1 e 20 e escreve
// os seus elementos na ordem inversa na tela
public class Ex05InverterVetor {
	public static void main(String[] args) {
		int[] valores = new int[6];

		System.out.println("-- Inverter a ordem dos elementos de um vetor "
			+ "--\n");

		for (int i = 0; i < valores.length; i++) {
			valores[i] = (int)(Math.random() * 20 + 1);
		}

		System.out.print("Vetor original: ");

		for (int k : valores) {
			System.out.print(k + " ");
		}

		System.out.print("\nVetor invertido: ");

		for (int l = valores.length - 1; l >= 0; l--) {
			System.out.print(valores[l] + " ");
		}

		System.out.println();
	}
}
