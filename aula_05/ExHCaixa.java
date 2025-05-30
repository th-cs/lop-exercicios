// Lê a largura, comprimento e altura de uma caixa retangular e calcula o seu
// volume
import java.util.Scanner;

public class ExHCaixa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declaração das variáveis
		double largura, comprimento, altura, volume;

		System.out.println("-- Cálculo do volume de uma caixa retangular --\n");

		// Entrada das informações
		System.out.print("Olá, digite a largura da caixa (cm): ");
		largura = input.nextDouble();
		System.out.print("Digite o comprimento da caixa (cm): ");
		comprimento = input.nextDouble();
		System.out.print("Digite a altura da caixa (cm): ");
		altura = input.nextDouble();

		// Cálculo
		volume = largura * comprimento * altura;

		// Saída
		System.out.printf("\nO volume dessa caixa é de %.2f cm³\n", volume);
		
		input.close();
	}
}