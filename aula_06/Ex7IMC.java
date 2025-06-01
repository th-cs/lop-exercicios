// Calcula o IMC de uma pessoa e escreve a categoria em que ela está
import java.util.Scanner;

public class Ex7IMC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double altura, peso, imc;

		System.out.println("-- Cálculo de IMC --\n");

		System.out.print("Olá, digite a sua altura em metros: ");
		altura = input.nextDouble();
		System.out.print("Agora digite o seu peso em quilogramas: ");
		peso = input.nextDouble();

		imc = peso / (altura * altura);

		if (imc < 17) {
			System.out.printf("Seu IMC é %.2f kg/m². Você está muito abaixo do "
				+ "peso\n", imc);
		} else if (imc >= 17 && imc < 18.5) {
			System.out.printf("Seu IMC é %.2f kg/m². Você está abaixo do "
				+ "peso\n", imc);
		} else if (imc >= 18.5 && imc < 25) {
			System.out.printf("Seu IMC é %.2f kg/m². Você está com o peso "
				+ "normal\n", imc);
		} else if (imc >= 25 && imc < 30) {
			System.out.printf("Seu IMC é %.2f kg/m². Você está acima do peso\n",
				imc);
		} else if (imc >= 30 && imc < 35) {
			System.out.printf("Seu IMC é %.2f kg/m². Você está com obesidade "
				+ "grau I\n", imc);
		} else if (imc >= 35 && imc < 40) {
			System.out.printf("Seu IMC é %.2f kg/m². Você está com obesidade "
				+ "grau II (severa)\n", imc);
		} else {
			System.out.printf("Seu IMC é %.2f kg/m². Você está com obesidade "
				+ "grau III (mórbida)\n", imc);
		}

		input.close();
	}
}
