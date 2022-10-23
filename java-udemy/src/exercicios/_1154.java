package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _1154 {
	public static void main(String[] args) {
		/*Faça um algoritmo para ler um número indeterminado de dados,
		 * contendo cada um, a idade de um indivíduo.
		 * O último dado, que não entrará nos cálculos, contém o valor de idade negativa.
		 * Calcular e imprimir a idade média deste grupo de indivíduos.
		Entrada
			A entrada contém um número indeterminado de inteiros.
			A entrada será encerrada quando um valor negativo for lido.
		Saída
			A saída contém um valor correspondente à média de idade dos indivíduos.
		    A média deve ser impressa com dois dígitos após o ponto decimal.*/

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
