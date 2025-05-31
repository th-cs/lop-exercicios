// Lê a altura e o diâmetro de uma lata
// de óleo e calcula o seu volume
import java.util.Scanner;

public class ExCLata {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaração das variáveis
		double altura, diametro, volume;

		System.out.println("-- Cálculo do volume de uma lata --\n");

		// Entrada das informações
		System.out.print("Olá, qual é a altura da lata em centímetros? ");
		altura = input.nextDouble();
		System.out.print("Qual é o diâmetro da lata, também em centímetros? ");
		diametro = input.nextDouble();

		// Cálculo
		volume = 3.14159 * Math.pow((diametro / 2), 2) * altura;

		// Saída
		System.out.printf("\nO volume dessa lata é de %.2f cm³\n", volume);

		input.close();
	}
}
