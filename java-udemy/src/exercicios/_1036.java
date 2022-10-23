package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _1036 {

	public static void main(String[] args) {
		/*Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes da equa��o de Bhaskara.
		 * Se n�o for poss�vel calcular as ra�zes, mostre a mensagem correspondente �Impossivel calcular�,
		 * caso haja uma divis�o por 0 ou raiz de numero negativo.

			Entrada
			Leia tr�s valores de ponto flutuante (double) A, B e C.
			x = -b +- raiz de delta /2.a
			delta = b� - 4 ac
			Sa�da
			Se n�o houver possibilidade de calcular as ra�zes, apresente a mensagem "Impossivel calcular".
			Caso contr�rio, imprima o resultado das ra�zes com 5 d�gitos ap�s o ponto	
			"R1 = -0.29788"
		    "R2 = -1.71212"
			com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha ap�s cada mensagem.*/

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double delta , raiz1 , raiz2;
		
		delta = (Math.pow(b,2))- 4*(a*c);
		
		if((delta > 0) && (a!=0)){
			raiz1 = (-b + Math.sqrt(delta))/(2*a);
			raiz2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.printf("R1 = %.5f%n", raiz1);
			System.out.printf("R2 = %.5f%n", raiz2);
		}
		
		else {	
			System.out.println("Impossivel calcular");
		}
		sc.close();
	}
	}
