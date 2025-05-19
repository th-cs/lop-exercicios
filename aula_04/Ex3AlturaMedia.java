// Lê o nome e altura de duas pessoas. Escreve na tela
// os nomes dessas pessoas e a altura média delas com
// 2 casas decimais
import java.util.Scanner;

public class Ex3AlturaMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declaração das variáveis
		String nome1, nome2;
		double altura1, altura2, mediaAltura;
		
		// Entrada das informações
		System.out.print("Olá, qual é o nome da primeira pessoa? ");
		nome1 = sc.nextLine();
		System.out.print("E qual é a sua altura? ");
		altura1 = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Qual é o nome da segunda pessoa? ");
		nome2 = sc.nextLine();
		System.out.print("E qual é a sua altura? ");
		altura2 = sc.nextDouble();
		
		// Processamento
		mediaAltura = (altura1 + altura2) / 2;
		
		// Saída
		System.out.println(String.format("\nA altura média de %s e %s é de %.2f metros.",
		                                 nome1, nome2, mediaAltura));
		
		sc.close();
	}
}
