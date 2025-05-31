// Lê uma temperatura em graus Fahrenheit e a converte para graus Celsius
import java.util.Scanner;

public class ExBFahrenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaração das variáveis
		double tempF, tempC;

		System.out.println("-- Conversão de temperatura de °F para °C --\n");

		// Entrada das informações
		System.out.print("Olá, digite a temperatura em graus °F a ser convertida "
			+ "para °C: ");
		tempF = input.nextDouble();

		// Cálculo
		tempC = (tempF - 32) * 5 / 9;

		// Saída
		System.out.printf("\nTemperaturas:\n%.1f °F | %.1f °C\n", tempF, tempC);

		input.close();
	}
}
