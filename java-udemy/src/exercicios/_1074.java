package exercicios;

import java.util.Scanner;

public class _1074 {

	public static void main(String[] args) {
		/* CONCLUIDO 03/10/2022
		 * Leia um valor inteiro N. 
		 * 
		 * Este valor será a quantidade de valores que serão lidos em seguida. 
		 * Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido 
		 *  par: (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). 
		 * No caso do valor ser igual a zero (0), NULL.

			Entrada
		A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste.
		Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

			Saída
		Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. 
		Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(num%2 == 0 && num > 0) {
				System.out.println("EVEN POSITIVE");				
			}
			else if(num%2 == 0 && num < 0) {
				System.out.println("EVEN NEGATIVE");
			}
			else if(num%2 != 0 && num < 0) {
				System.out.println("ODD NEGATIVE");
			}
			else if(num%2 != 0 && num > 0) {
				System.out.println("ODD POSITIVE");
			}
			else {
				System.out.println("NULL");
			}			
		}				
		sc.close();
	}
}
