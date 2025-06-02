// Lê múltiplos números e verifica se são pares ou ímpares
import java.util.Scanner;

public class Ex2ParImpar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;

		System.out.println("-- Número par ou ímpar --\n\n"
			+ "> Digite 0 para sair do loop\n");

		do {
			System.out.print("Digite um número inteiro: ");
			num = input.nextInt();

			if (num == 0) {
				System.out.println("Saindo do loop...");
			} else if (num % 2 == 0) {
				System.out.printf("%d é um número par\n", num);
			} else {
				System.out.printf("%d é um número ímpar\n", num);
			}
		} while (num != 0);

		input.close();
	}
}
