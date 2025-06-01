// Lê um ano e verifica
// se é um ano bissexto
import java.util.Scanner;

public class Ex4Bissexto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int ano;

		System.out.println("-- Cálculo de ano bissexto --\n");

		System.out.print("Olá, digite o ano a ser verificado: ");
		ano = input.nextInt();

		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.printf("%d é um ano bissexto\n", ano);
		} else {
			System.out.printf("%d não é um ano bissexto\n", ano);
		}

		input.close();
	}
}
