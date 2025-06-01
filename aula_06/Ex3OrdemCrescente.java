// Lê três números e os escreve
// em ordem crescente
import java.util.Scanner;

public class Ex3OrdemCrescente {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("-- Números em ordem crescente --\n");

		System.out.print("Olá, digite o primeiro número: ");
		num1 = input.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = input.nextInt();
		System.out.print("Digite o terceiro número: ");
		num3 = input.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			if (num2 >= num3) {
				System.out.printf("\nOrdem: %d, %d, %d\n", num3, num2, num1);
			} else {
				System.out.printf("\nOrdem: %d, %d, %d\n", num2, num3, num1);
			}
		} else if (num2 >= num1 && num2 >= num3) {
			if (num1 >= num3) {
				System.out.printf("\nOrdem: %d, %d, %d\n", num3, num1, num2);
			} else {
				System.out.printf("\nOrdem: %d, %d, %d\n", num1, num3, num2);
			}
		} else {
			if (num1 >= num2) {
				System.out.printf("\nOrdem: %d, %d, %d\n", num2, num1, num3);
			} else {
				System.out.printf("\nOrdem: %d, %d, %d\n", num1, num2, num3);
			}
		}

		input.close();
	}
}
