package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities._0001T;


public class _0001TrianguloClass {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String max;
		_0001T x, y;
		x = new _0001T();
		y = new _0001T();
		
		System.out.println("Insira os 3 dados do triangulo 1");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira os 3 dados do triangulo 2");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.println("Calculando area dos triangulos [...Aguarde...]");
		double areaX = x.area();
		
		System.out.printf("Valor da área do triangulo 1 = %.4f%n", areaX);
		
		double areaY = y.area();
		
		System.out.printf("Valor da área do triangulo 2 = %.4f%n", areaY);
		
		max = (areaX > areaY) ? "Triangulo 1" : "Triangulo 2" ;
		
		System.out.printf("O Triangulo com maior área é o: %s%n", max);
			
		sc.close();
	}

}
