package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _1154 {
	public static void main(String[] args) {
		/*Fa�a um algoritmo para ler um n�mero indeterminado de dados,
		 * contendo cada um, a idade de um indiv�duo.
		 * O �ltimo dado, que n�o entrar� nos c�lculos, cont�m o valor de idade negativa.
		 * Calcular e imprimir a idade m�dia deste grupo de indiv�duos.
		Entrada
			A entrada cont�m um n�mero indeterminado de inteiros.
			A entrada ser� encerrada quando um valor negativo for lido.
		Sa�da
			A sa�da cont�m um valor correspondente � m�dia de idade dos indiv�duos.
		    A m�dia deve ser impressa com dois d�gitos ap�s o ponto decimal.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int pessoa = 0;
		double media, soma = 0;
		
		while(idade >0){
			pessoa++;
			soma = (double) soma + idade;
			idade = sc.nextInt();
		}
		 media =(double) soma /pessoa;
		 
		System.out.printf("%.2f%n", media);

	sc.close();
}
}
