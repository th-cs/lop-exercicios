// Lê o preço unitário de um produto de uma mercearia, quantidade de unidades
// compradas por um cliente e o valor pago. Calcula o valor do troco
import java.util.Scanner;

public class Ex4Troco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declaração das variáveis
		double precoUnitario, valorPago, troco;
		int quantidade;
		
		// Entrada das informações
		System.out.print("Digite o preço unitário do produto: R$ ");
		precoUnitario = sc.nextDouble();
		System.out.print("Digite a quantidade de unidades compradas: ");
		quantidade = sc.nextInt();
		System.out.print("Digite o valor pago pelo cliente: R$ ");
		valorPago = sc.nextDouble();
		
		// Processamento
		troco = valorPago - (precoUnitario * quantidade);
		
		// Saída
		System.out.println(String.format("\n- Preço unitário do produto: R$ %.2f"
		                               + "\n- Quantidade comprada: %d unidade(s)"
		                               + "\n- Valor pago pelo cliente: R$ %.2f"
		                               + "\n- Troco a ser devolvido: R$ %.2f",
		                               precoUnitario, quantidade, valorPago,
		                               troco));
		
		sc.close();
	}
}
