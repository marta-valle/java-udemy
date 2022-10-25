package aulas;

import java.util.Scanner;
import java.util.Locale;

public class aula20 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			double pfinal, area ;
			
			System.out.println("Fazer um programa para ler: \r\n"
					+ "As medidas da largura e comprimento de um terreno retangular, com uma casa decimal \r\n"
					+ "Incluir o valor do metro quadrado do terreno com duas casas decimais. \r\n"
					+ "Em seguida, o programa deve mostrar o valor da área do terrenoe também o valor do preço do terreno, ambos com duas casas decimais,\r\n"
								);
			System.out.println("Insira o valor do m²");

			double p_metro = sc.nextDouble();

			System.out.println("Insira a Largura do lote:");

			double largura = sc.nextDouble();

			System.out.println("Valor Inserido:" + largura);

			System.out.println("Insira o Comprimento do lote:");
			
			double comprimento = sc.nextDouble();

			System.out.println("Valor Inserido:" + comprimento);

			area = largura*comprimento;
			
			System.out.printf("Area total do terreno é: %.2f m²", area);
			System.out.println("");
			
			pfinal = area * p_metro;
			
			System.out.printf("Valor final do lote: %.2f%n ", pfinal);
			
			sc.close();
		}
		
	}

}
