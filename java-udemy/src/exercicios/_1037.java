package exercicios;

import java.util.Locale;
import java.util.Scanner;
public class _1037 {
	public static void main(String[] args) {
		/*Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos 
		 * ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
		 * Obviamente se o valor n�o estiver em nenhum destes intervalos, dever� ser impressa a mensagem �Fora de intervalo�.

		O s�mbolo ( representa "maior que". Por exemplo:
		[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
		(25,50] indica valores maiores que 25 Ex: 25.00001 at� o valor 50.0000000

			Entrada
		O arquivo de entrada cont�m um n�mero com ponto flutuante qualquer.

			Sa�da
		A sa�da deve ser uma mensagem conforme exemplo abaixo.*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double numeroA = sc.nextDouble();
		
	    if (numeroA < 0 || numeroA > 100) {
	        System.out.println("Fora de intervalo");
	      }

	      else if (numeroA >= 0 && numeroA <= 25) {
	        System.out.println("Intervalo [0,25]");
	      }

	      else if (numeroA > 25 && numeroA <= 50) {
	        System.out.println("Intervalo (25,50]");
	      }

	      else if (numeroA > 50 && numeroA <= 25) {
	        System.out.println("Intervalo (50,75]");
	      }

	      else if (numeroA > 75 && numeroA <= 100) {
	        System.out.println("Intervalo (75,100]");
	      }
		sc.close();
	}
}
