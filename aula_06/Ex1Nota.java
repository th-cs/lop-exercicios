// Lê a nota de um aluno e escreve na tela
// "Aprovado" se for maior ou igual a 7 e
// "Reprovado" caso contrário
import java.util.Scanner;

public class Ex1Nota {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("-- Nota aprovada ou reprovada --\n");

		double nota;

		System.out.print("Olá, digite a sua nota: ");
		nota = input.nextDouble();

		// A nota tem que estar dentro do intervalo comum
		if (nota >= 7 && nota <= 10) {
			System.out.println("Parabéns, você foi aprovado!");
		} else if (nota >= 0 && nota < 7) {
			System.out.println("Você foi reprovado");
		} else {
			System.out.print("Nota inválida\n");
		}

		input.close();
	}
}
