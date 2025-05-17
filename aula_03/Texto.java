// Lê uma entrada de texto e a escreve na tela
import java.util.Scanner;

public class Texto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declaração da variável e entrada da informação. Declara uma variável
		// do tipo String inicializada com o valor digitado
		String texto = sc.next();
		
		System.out.println(texto);
		
		sc.close();
	}
}
