// Lê uma temperatura em graus Celsius e a converte para graus Fahrenheit
import java.util.Scanner;

public class ExACelsius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaração das variáveis
		double tempC, tempF;

		System.out.println("-- Conversão de temperatura de °C para °F --\n");

		// Entrada das informações
		System.out.print("Olá, digite a temperatura em graus °C a ser convertida "
			+ "para °F: ");
		tempC = input.nextDouble();

		// Cálculo
		tempF = (tempC * 9 / 5) + 32;

		// Saída
		System.out.printf("\nTemperaturas:\n%.1f °C | %.1f °F\n", tempC, tempF);

		input.close();
	}
}
