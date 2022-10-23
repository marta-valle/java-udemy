package exercicios;

import java.util.Scanner;

public class _1044 {

	public static void main(String[] args) {
		/*Leia 2 valores inteiros (A e B). 
		 * Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos entre si.

		Entrada
			A entrada cont�m valores inteiros.

		Sa�da
			A sa�da deve conter uma das mensagens conforme descrito acima.*/
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y =sc.nextInt();
		
		if( x % y == 0 || y % x == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}
}
