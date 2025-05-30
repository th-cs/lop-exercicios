// Lê o tempo gasto e a velocidade média de um automóvel durante uma
// viagem. Calcula a distância percorrida e a quantidade de litros
// de combustível utilizada (considerando que esse automóvel consome
// 1 litro a cada 12 km)
import java.util.Scanner;

public class ExDCombustivel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declaração das variáveis
		int velocidade;
		double tempo, distancia, quantidadeLitros, kmLitro = 12;

		System.out.println("-- Cálculo de distância percorrida e combustível "
			+ "utilizado em uma viagem --\n");
		
		// Entrada das informações
		System.out.print("Olá, qual foi o tempo de viagem em minutos? ");
		tempo = input.nextDouble();
		System.out.print("Qual foi a velocidade média do automóvel em km/h? ");
		velocidade = input.nextInt();
		
		// Cálculo
		distancia = (tempo / 60) * velocidade;
		quantidadeLitros = distancia / kmLitro;
		
		// Saída
		System.out.printf("\n- Tempo de viagem: %d Hora(s) e %.0f Minuto(s)"
			+ "\n- Velocidade média: %d km/h\n- Distância percorrida: %.1f km"
			+ "\n- Quantidade de combustível utilizada: %.2f L\n",
			(int)tempo / 60, tempo % 60, velocidade, distancia, quantidadeLitros);

		input.close();
	}
}