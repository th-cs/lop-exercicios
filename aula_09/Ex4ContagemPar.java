// Lê um valor e retorna a contagem de todos
// os números pares entre 0 e ele
import java.util.Scanner;

public class Ex4ContagemPar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;

		System.out.println("-- Contagem apenas com pares --\n");

		System.out.print("Olá, digite o último número da contagem: ");
		num = input.nextInt();

		if (num >= 0) {
			for (int i = 0; i <= num; i += 2) {
				System.out.println(i);
			}
		} else {
			for (int i = 0; i >= num; i -= 2) {
				System.out.println(i);
			}
		}

		input.close();
	}
}
