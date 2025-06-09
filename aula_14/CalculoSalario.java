// Calcula o salário líquido de um funcionário com base nas seguintes
// informações:
// - Salário bruto
// - Número de dependentes
// - Tipo de plano de saúde
// - Vale-transporte
// - Vale-alimentação
// - Vale-refeição
// Retorna o salário líquido e o percentual de descontos
import java.util.Scanner;

public class CalculoSalario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double salarioBruto, salarioCalculo, salarioLiquido;
		int numeroDependentes = 0;
		String[] planosSaude = {"Básico", "Avançado"};
		String tipoPlanoSaude = " ";
		double descontoINSS = 0, descontoIR = 0, descontoPlanoSaude = 0,
			descontoValeTransporte = 0, descontoValeAlimentacao = 0,
			descontoValeRefeicao = 0;
		boolean possuiDependentes = false, possuiPlanoSaude = false,
			possuiValeTransporte = false, possuiValeAlimentacao = false,
			possuiValeRefeicao = false;
		int opcao1, opcao2, opcao3, opcao4, opcao5;

		System.out.println("-- Cálculo do salário líquido --\n");

		// Entrada do salário bruto
		do {
			System.out.print("Olá, digite o seu salário bruto: R$ ");
			salarioBruto = input.nextDouble();

			if (salarioBruto < 0) {
				System.out.println("Você tem que digitar um valor positivo\n");
			}
		} while (salarioBruto < 0);

		// Entrada do número de dependentes
		do {
			System.out.print("\nVocê possui algum dependente? Digite o valor "
				+ "correspondente:\n[ 1 ] - Sim\n[ 2 ] - Não\n");
			opcao1 = input.nextInt();

			if (opcao1 == 1) {
				possuiDependentes = true;

				do {
					System.out.print("Quantos dependentes você possui? ");
					numeroDependentes = input.nextInt();

					if (numeroDependentes == 0) {
						possuiDependentes = false;
					} else if (numeroDependentes < 0) {
						System.out.print("Você tem que digitar um número "
							+ "positivo\n\n");
					}
				} while (numeroDependentes < 0);

			} else if (opcao1 == 2) {
				possuiDependentes = false;
				numeroDependentes = 0;
			} else {
				System.out.printf("%d é uma opção inválida. Você tem que "
					+ "digitar 1 ou 2\n", opcao1);
			}
		} while (opcao1 < 1 || opcao1 > 2);

		salarioCalculo = salarioBruto - (189.59 * numeroDependentes);

		// Entrada do tipo de plano de saúde
		do {
			System.out.print("\nVocê possui plano de saúde? Se sim, qual é "
				+ "o tipo?\n[ 1 ] - Não possuo plano de saúde\n"
				+ "[ 2 ] - Sim, tenho o plano de saúde básico\n"
				+ "[ 3 ] - Sim, tenho o plano de saúde avançado\n");
			opcao2 = input.nextInt();

			if (opcao2 == 1) {
				possuiPlanoSaude = false;
			} else if (opcao2 == 2) {
				possuiPlanoSaude = true;
				tipoPlanoSaude = planosSaude[0];
			} else if (opcao2 == 3) {
				possuiPlanoSaude = true;
				tipoPlanoSaude = planosSaude[1];
			} else {
				System.out.printf("%d é uma opção inválida. Você tem que "
					+ "digitar 1, 2 ou 3\n", opcao2);
			}
		} while (opcao2 < 1 || opcao2 > 3);

		// Entrada do vale-transporte
		do {
			System.out.print("\nVocê possui vale-transporte?\n[ 1 ] - Sim\n"
				+ "[ 2 ] - Não\n");
			opcao3 = input.nextInt();

			if (opcao3 == 1) {
				possuiValeTransporte = true;
			} else if (opcao3 == 2) {
				possuiValeTransporte = false;
			} else {
				System.out.printf("%d é uma opção inválida. Você tem que "
					+ "digitar 1 ou 2\n", opcao3);
			}
		} while (opcao3 < 1 || opcao3 > 2);

		// Entrada do vale-alimentação
		do {
			System.out.print("\nVocê possui vale-alimentação?\n[ 1 ] - Sim\n"
				+ "[ 2 ] - Não\n");
			opcao4 = input.nextInt();

			if (opcao4 == 1) {
				possuiValeAlimentacao = true;
			} else if (opcao4 == 2) {
				possuiValeAlimentacao = false;
			} else {
				System.out.printf("%d é uma opção inválida. Você tem que "
					+ "digitar 1 ou 2\n", opcao4);
			}
		} while (opcao4 < 1 || opcao4 > 2);

		// Entrada do vale-refeição
		do {
			System.out.print("\nVocê possui vale-refeição?\n[ 1 ] - Sim\n"
				+ "[ 2 ] - Não\n");
			opcao5 = input.nextInt();

			if (opcao5 == 1) {
				possuiValeRefeicao = true;
			} else if (opcao5 == 2) {
				possuiValeRefeicao = false;
			} else {
				System.out.printf("%d é uma opção inválida. Você tem que "
					+ "digitar 1 ou 2\n", opcao5);
			}
		} while (opcao5 < 1 || opcao5 > 2);

		// Desconto do INSS
		if (salarioBruto <= 1302.00) {
			descontoINSS = salarioBruto * 0.08;
		} else if ( salarioBruto >= 1302.01 && salarioBruto <= 2571.00) {
			descontoINSS = salarioBruto * 0.09;
		} else if ( salarioBruto >= 2571.01 && salarioBruto <= 3856.00) {
			descontoINSS = salarioBruto * 0.11;
		} else {
			descontoINSS = salarioBruto * 0.14;
		}

		// Desconto do IR
		if (salarioCalculo <= 1903.98) {
			descontoIR = 0;
		} else if (salarioCalculo >= 1903.99 && salarioCalculo <= 2826.65) {
			descontoIR = (salarioCalculo * 0.075) - 142.80;
		} else if (salarioCalculo >= 2826.66 && salarioCalculo <= 3751.05) {
			descontoIR = (salarioCalculo * 0.15) - 354.80;
		} else if (salarioCalculo >= 3751.06 && salarioCalculo <= 4664.68) {
			descontoIR = (salarioCalculo * 0.225) - 636.13;
		} else {
			descontoIR = (salarioCalculo * 0.275) - 869.36;
		}

		// Desconto do plano de saúde
		if (possuiPlanoSaude == true) {
			if (tipoPlanoSaude == "Básico") {
				descontoPlanoSaude = 150.00;
			} else if (tipoPlanoSaude == "Avançado") {
				descontoPlanoSaude = 300.00;
			}
		} else {
			descontoPlanoSaude = 0;
		}

		// Desconto do vale-transporte
		if (possuiValeTransporte == true) {
			descontoValeTransporte = salarioBruto * 0.06;
		} else {
			descontoValeTransporte = 0;
		}

		// Desconto do vale-alimentação
		if (possuiValeAlimentacao == true) {
			descontoValeAlimentacao = 200;
		} else {
			descontoValeAlimentacao = 0;
		}

		// Desconto do vale-refeição
		if (possuiValeRefeicao == true) {
			descontoValeRefeicao = 250;
		} else {
			descontoValeRefeicao = 0;
		}

		salarioLiquido = salarioBruto - descontoINSS - descontoIR -
			descontoPlanoSaude - descontoValeTransporte -
			descontoValeAlimentacao - descontoValeRefeicao;

		System.out.println("\n- Informações -\n");
		System.out.printf("Salário líquido: R$ %.2f\nSalário bruto: R$ %.2f\n\n"
			+ "Desconto do INSS: R$ %.2f\nDesconto do IR: R$ %.2f\nDesconto do "
			+ "plano de saúde: R$ %.2f\nDesconto do vale-transporte: R$ %.2f\n"
			+ "Desconto do vale-alimentação: R$ %.2f\nDesconto do "
			+ "vale-refeição: R$ %.2f\n\nDescontos totais: R$ %.2f\n",
			salarioLiquido, salarioBruto, descontoINSS, descontoIR,
			descontoPlanoSaude, descontoValeTransporte, descontoValeAlimentacao,
			descontoValeRefeicao, salarioBruto - salarioLiquido);

		input.close();
	}
}
