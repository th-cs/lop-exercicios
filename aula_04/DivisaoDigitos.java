// Cálculo da divisão de dois números com resultado formatado
import java.util.Scanner;

public class DivisaoDigitos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declaração das variáveis
		double dividendo, divisor, quociente;
		
		// Entrada das informações
		System.out.print("Olá, digite o primeiro número da divisão: ");
		dividendo = sc.nextDouble();
		System.out.print("Agora digite o segundo número da divisão: ");
		divisor = sc.nextDouble();
		
		// Processamento
		quociente = dividendo / divisor;
		
		// Saída com decimal de 2 dígitos depois da vírgula
		System.out.println(String.format("A divisão de " + dividendo + " por "
		                               +  divisor + " é %.2f", quociente));
		
		sc.close();
	}
}
