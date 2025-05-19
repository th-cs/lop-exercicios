// Lê as dimensões de largura e comprimento de um cômodo retangular (1 casa decimal)
// e o valor do metro quadrado do piso (2 casas decimais). Calcula e exibe a área
// total do cômodo e o custo total para cobrir o piso (ambos com 2 casas decimais)
import java.util.Scanner;

public class Ex1Piso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declaração das variáveis
		double larguraComodo, comprimentoComodo, valorMetroPiso;
		double areaComodo, custoTotalPiso;
		
		// Entrada das informações
		System.out.print("Olá, digite a largura do cômodo em metros: ");
		larguraComodo = sc.nextDouble();
		System.out.print("Digite o comprimento do cômodo em metros: ");
		comprimentoComodo = sc.nextDouble();
		System.out.print("Digite o valor do m² do piso: R$ ");
		valorMetroPiso = sc.nextDouble();
		
		// Processamento
		areaComodo = larguraComodo * comprimentoComodo;
		custoTotalPiso = valorMetroPiso * areaComodo;
		
		// Saída
		// Valores formatados
		System.out.println(String.format("\nLargura do cômodo: %.1f m"
		                               + "\nComprimento do cômodo: %.1f m"
		                               + "\nValor do m² do piso: R$ %.2f"
		                               + "\nÁrea total do cômodo: %.2f m²"
		                               + "\nCusto total para cobrir o piso: R$ %,.2f",
		                               larguraComodo, comprimentoComodo, valorMetroPiso,
		                               areaComodo, custoTotalPiso));
		
		sc.close();
	}
}
