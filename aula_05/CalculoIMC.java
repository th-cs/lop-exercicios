// Lê a altura e peso de uma pessoa e calcula o IMC
import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaração das variáveis
		double altura, peso, imc;

		System.out.println("-- Cálculo de IMC --\n");

		// Entrada das informações
		System.out.print("Olá, qual é a sua altura em metros? ");
		altura = input.nextDouble();
		System.out.print("E qual é o seu peso em quilogramas? ");
		peso = input.nextDouble();

		// Processamento
		imc = peso / (altura * altura);

		// Saída
		System.out.printf("\nSuas medidas:\n- Altura: %.2f m\n- Peso: %.2f kg"
			+ "\n- Índice de Massa Corporal: %.4f kg/m²\n", altura, peso, imc);

		input.close();
	}
}
