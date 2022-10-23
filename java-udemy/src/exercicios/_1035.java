package exercicios;

import java.util.Scanner;

public class _1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quatro valores inteiros separados por enter");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(b > c && d > a && d + c > a + b && (c >= 0)&& (d >=0) && (a%2 == 0) ) {
			System.out.println("Valores aceitos");
		}
		else{
			System.out.println("Valores nao aceitos");
		}	
		sc.close();
	}
}
