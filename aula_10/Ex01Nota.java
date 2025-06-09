// Lê o valor da nota de um estudante. Escreve se foi aprovado
// (maior que 7), reprovado (menor que 4) ou ficou de
// recuperação (entre 4 e 7)
import java.util.Scanner;

public class Ex01Nota {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double nota;

		System.out.println("-- Nota aprovada, reprovada ou em recuperação "
			+ "--\n");

		do {
			System.out.print("Olá, qual foi a sua nota? ");
			nota = input.nextDouble();

			if (nota >= 0 && nota <= 10) {
				if (nota > 7) {
					System.out.println("Você foi aprovado!");
				} else if (nota < 4) {
					System.out.println("Você foi reprovado");
				} else {
					System.out.println("Você ficou de recuperação");
				}
			} else {
				System.out.println("Digite uma nota válida\n");
			}
		} while (nota < 0 || nota > 10);

		input.close();
	}
}
