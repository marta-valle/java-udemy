package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _1010 {

	public static void main(String[] args) {
		/*" Neste problema, deve-se ler: "
				+ "código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1;"
				+ "o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2."
				+ "Após, calcule e mostre o valor a ser pago.\r\n"
				
				+ "\r\n"
				+ "		Entrada\r\n"
				+ "		O arquivo de entrada contém duas linhas de dados."
				+ "Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.\r\n"
				+ "\r\n"
				+ "		Saída\r\n"
				+ "		A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o \"R$\". O valor deverá ser apresentado com 2 casas após o ponto.\r\n"
				+ "");*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valFinal;
		
		int cod1 = sc.nextInt();
		int num1 = sc.nextInt();
		double val1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int num2 = sc.nextInt();
		double val2 = sc.nextDouble();
		
		valFinal = (val1 * num1 + num2 * val2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valFinal);
		
		sc.close();
	
	}

}
