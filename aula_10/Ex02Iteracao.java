// Lê um valor e soma ele a si mesmo 5 vezes. Em cada iteração o resultado é
// multiplicado por 2. Calcula e escreve o resultado na tela
import java.util.Scanner;

public class Ex02Iteracao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x, y;

		System.out.print("Digite um número: ");
		x = input.nextInt();
		y = x;

		for (int i = 0; i < 5; i++) {
			y += x;
			y *= 2;
		}

		System.out.printf("Resultado: %,d\n", y);

		input.close();
	}
}
