package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _0001TrianguloTrad {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		String max;
		
		System.out.println("Insira os 3 dados do triangulo 1");
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double c1 = sc.nextDouble();
		
		System.out.println("Insira os 3 dados do triangulo 2");
		double a2 = sc.nextDouble();
		double b2 = sc.nextDouble();
		double c2 = sc.nextDouble();
		
		System.out.println("Calculando area dos triangulos [...Aguarde...]");
		double p1, p2;
				
		p1 = (a1 + b1 + c1)/2;
		double area1 = Math.sqrt(p1*(p1-a1)*(p1-b1)*(p1-c1));
		System.out.printf("Valor da área do triangulo 1 = %.4f%n", area1);
		
		p2 = (a2 + b2 + c2)/2;
		double area2 = Math.sqrt(p2*(p2-a2)*(p2-b2)*(p2-c2));
		System.out.printf("Valor da área do triangulo 2 = %.4f%n", area2);
		
		max = (area1 > area2) ? "Triangulo 1" : "Triangulo 2" ;
		
		System.out.printf("O Triangulo com maior área é o: %s%n", max);
			
		sc.close();
	}

}
