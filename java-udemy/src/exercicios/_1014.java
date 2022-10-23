package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class _1014 {

	public static void main(String[] args) {
		/*Calcule o consumo m�dio de um autom�vel
		 * sendo fornecidos a dist�ncia total percorrida (em Km) e o total de combust�vel gasto (em litros).

		Entrada
		O arquivo de entrada cont�m dois valores:
		um valor inteiro X representando a dist�ncia total percorrida (em Km),
		e um valor real Y representando o total de combust�vel gasto, com um d�gito ap�s o ponto decimal.

		Sa�da
		Apresente o valor que representa o consumo m�dio do autom�vel com 3 casas ap�s a v�rgula, seguido da mensagem "km/l".*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double km;
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		km =  x / y;
		
		System.out.printf("%.3f Km/l%n", km);
		
		sc.close();		
	}

}
