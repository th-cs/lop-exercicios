// Lê as dimensões de altura e largura de um quadro retangular. Calcula e exibe
// a área total, perímetro e diagonal do quadro com 4 casas decimais
import java.util.Scanner;

public class Ex2Quadro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declaração das variáveis
		double altura, largura;
		double areaTotal, perimetro, diagonal;
		
		// Entrada das informações
		System.out.print("Olá, digite a altura do quadro em centímetros: ");
		altura = sc.nextDouble();
		System.out.print("Agora digite a largura do quadro em centímetros: ");
		largura = sc.nextDouble();
		
		// Processamento
		areaTotal = altura * largura;
		perimetro = 2 * (altura + largura);
		diagonal = Math.sqrt((altura * altura) + (largura * largura));
		
		// Saída
		System.out.println(String.format("\nÁrea total do quadro: %.4f cm²"
		                               + "\nPerímetro do quadro: %.4f cm"
		                               + "\nDiagonal do quadro: %.4f cm",
		                               areaTotal, perimetro, diagonal));
		
		sc.close();
	}
}
