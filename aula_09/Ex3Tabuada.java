// Lê um número e escreve a tabuada dele
import java.util.Scanner;

public class Ex3Tabuada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int fator1, produto;
		int fator2 = 0;

		System.out.println("-- Tabuada --\n");

		System.out.print("Olá, digite o número que deseja ver a tabuada: ");
		fator1 = input.nextInt();

		do {
			produto = fator1 * fator2;
			System.out.printf("%d x %d = %d\n", fator1, fator2, produto);
			fator2 += 1;
		} while (fator2 <= 10);

		input.close();
	}
}
