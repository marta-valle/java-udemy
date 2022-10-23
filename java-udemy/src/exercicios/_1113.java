package exercicios;

import java.util.Scanner;

public class _1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != y) {
			if(x < y) {
			System.out.println("crescente");	
			}			
			else if( x > y){
			System.out.println("decrescente");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
				
		sc.close();
	}
}
