// Lê dois números reais, calcula a divisão do primeiro pelo segundo e
// escreve o resultado na tela
import java.util.Scanner;

public class Divisao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declaração das variáveis
		// Variáveis do tipo double para aceitar valores decimais
		double dividendo, divisor, quociente;

		// Entrada das informações
		System.out.print("Olá, digite o primeiro número da divisão: ");
		dividendo = sc.nextDouble();
		System.out.print("Agora digite o segundo número da divisão: ");
		divisor = sc.nextDouble();

		// Processamento
		quociente = dividendo / divisor;

		// Saída
		System.out.println("A divisão de " + dividendo + " por " +  divisor
		                 + " é " + quociente);

		sc.close();
	}
}
