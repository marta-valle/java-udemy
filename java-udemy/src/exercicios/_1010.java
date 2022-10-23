package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _1010 {

	public static void main(String[] args) {
		/*" Neste problema, deve-se ler: "
				+ "c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1;"
				+ "o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2."
				+ "Ap�s, calcule e mostre o valor a ser pago.\r\n"
				
				+ "\r\n"
				+ "		Entrada\r\n"
				+ "		O arquivo de entrada cont�m duas linhas de dados."
				+ "Em cada linha haver� 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.\r\n"
				+ "\r\n"
				+ "		Sa�da\r\n"
				+ "		A sa�da dever� ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espa�o ap�s os dois pontos e um espa�o ap�s o \"R$\". O valor dever� ser apresentado com 2 casas ap�s o ponto.\r\n"
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
