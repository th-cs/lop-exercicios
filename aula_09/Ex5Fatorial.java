// Lê um número e calcula o fatorial
import java.util.Scanner;

public class Ex5Fatorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num, fatorial = 1;

		System.out.println("-- Cálculo do fatorial --\n");

		do {
			System.out.print("Olá, digite um número: ");
			num = input.nextInt();

			if (num == 0) {
				System.out.println("0! é igual a 1");
			} else if (num > 0) {
				for (int i = 0; i < num; i += 1) {
					fatorial *= (num - i);
				}

				System.out.printf("%d! é igual a %,d\n",
					num, fatorial);
			} else {
				System.out.println("Digite um valor positivo ou nulo\n");
			}
		} while (num < 0);

		input.close();
	}
}
