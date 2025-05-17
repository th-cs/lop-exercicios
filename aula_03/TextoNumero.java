// Lê uma entrada de texto e uma de número inteiro e as escreve na tela
import java.util.Scanner;

public class TextoNumero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declaração das variáveis e entrada das informações
		String texto = sc.next();
		int numero = sc.nextInt();
		
		System.out.println(texto + " " + numero);
		
		sc.close();
	}
}
