// Lê dois números e escreve na tela o maior deles
import java.util.Scanner;

public class Ex2MaiorNumero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1, num2;

		System.out.println("-- Encontrar o maior número --\n");

		System.out.print("Olá, digite o primeiro número: ");
		num1 = input.nextInt();
		System.out.print ("Agora digite o segundo número: ");
		num2 = input.nextInt();

		// Condicional que também considera duas entradas iguais
		if (num1 > num2) {
			System.out.printf("%d é maior que %d\n", num1, num2);
		} else if (num2 > num1) {
			System.out.printf("%d é maior que %d\n", num2, num1);
		} else {
			System.out.println("Os dois números são iguais");
		}

		input.close();
	}
}
