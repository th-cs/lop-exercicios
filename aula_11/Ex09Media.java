// Cria um vetor com 6 notas de um aluno e calcula a média. Aprovado se for
// maior ou igual a 7, caso contrário, reprovado
import java.util.Scanner;

public class Ex09Media {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] notas = new double[6];
		double nota, media;
		double soma = 0;
		String resultado;

		System.out.println("-- Média das notas --\n");

		for (int i = 0; i < notas.length; i++) {
			do {
				System.out.printf("Digite a %dº nota: ", i + 1);
				nota = input.nextDouble();

				if (nota >= 0 && nota <= 10) {
					notas[i] = nota;
					soma += notas[i];
				} else {
					System.out.println("Digite uma nota válida\n");
				}
			} while (nota < 0 || nota > 10);
		}

		media = soma / 6;

		if (media >= 7) {
			resultado = "Aprovado";
		} else {
			resultado = "Reprovado";
		}

		System.out.print("\nNotas: ");

		for (double k : notas) {
			System.out.print(k + " ");
		}

		System.out.printf("\n\nMédia: %.1f\nResultado: %s\n", media, resultado);

		input.close();
	}
}
