// Lê um número e verifica se é
// positivo, negativo ou nulo
import java.util.Scanner;

public class Ex5NumeroInteiro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x;

		System.out.println("-- Número positivo, negativo ou nulo --\n");

		System.out.print("Olá, digite o número inteiro a ser verificado: ");
		x = input.nextInt();

		if (x > 0) {
			System.out.printf("\n%d é um número positivo\n", x);
		} else if (x < 0) {
			System.out.printf("\n%d é um número negativo\n", x);
		} else {
			System.out.println("\nVocê digitou um valor nulo");
		}

		input.close();
	}
}
