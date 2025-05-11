// Lê dois números inteiros, efetua a soma deles e escreve o resultado na tela

// Importa a classe scanner
import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		
		// Cria um objeto scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaração das variáveis
		int x, y, soma;
		
		// Entrada das informações
		System.out.print("Olá, digite o primeiro número: ");
		x = sc.nextInt();
		System.out.print("Agora digite o segundo número: ");
		y = sc.nextInt();
		
		// Processamento
		soma = x + y;
		
		// Saída
		System.out.println("A soma de " + x + " + " + y + " é " + soma);
		
		// Fecha o scanner
		sc.close();
	}
}
