package exercicios;

import java.util.Scanner;

public class _1142 {

	public static void main(String[] args) {
		/*executado dia 16/10/2022
		 * Escreva um programa que leia um valor inteiro N.
		 * 
		 *Este N � a quantidade de linhas de sa�da que ser�o apresentadas na execu��o do programa.

		Entrada
			O arquivo de entrada cont�m um n�mero inteiro positivo N.

		Sa�da
			Imprima a sa�da conforme o exemplo fornecido.
*/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cont = 0;
		
		for (int i = 0; i < n; i++) { // correto
			
			for (int j = 1; j < 4; j++) {
				cont = cont+1;
				System.out.printf("%d ", cont );
				}
			cont = cont+1;
			System.out.println("PUM");
			}
			
		sc.close();
	}

}
