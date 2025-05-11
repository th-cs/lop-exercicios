// Lê dois números inteiros, calcula a subtração do primeiro
// pelo segundo e escreve o resultado na tela

import java.util.Scanner;

public class Subtracao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declaração das variáveis
		int termo1, termo2, diferenca;
		
		// Entrada das informações
		System.out.print("Olá, digite o primeiro número da "
		               + "subtração: ");
		termo1 = sc.nextInt();
		System.out.print("Agora digite o segundo número da "
		               + "subtração: ");
		termo2 = sc.nextInt();
		
		// Processamento
		diferenca = termo1 - termo2;
		
		// Saída
		System.out.println("A subtração de " + termo1 + " por "
		                 +  termo2 + " é " + diferenca);
		
		sc.close();
	}
}
