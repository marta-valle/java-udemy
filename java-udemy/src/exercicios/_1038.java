package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int quantidade = sc.nextInt();
		double valorFinal;
		
		switch (cod) {
		case 1:
			valorFinal = quantidade * 4.00;
			System.out.printf( "Total: R$ %.2f%n", valorFinal );
			break;
		case 2:
			valorFinal = quantidade * 4.50;
			System.out.printf( "Total: R$ %.2f%n", valorFinal );
			break;
		case 3:
			valorFinal = quantidade * 5.00;
			System.out.printf( "Total: R$ %.2f%n", valorFinal );	
			break;
		case 4:
			valorFinal = quantidade * 2.00;
			System.out.printf( "Total: R$ %.2f%n", valorFinal );
			break;
		case 5:
			valorFinal = quantidade * 1.50;
			System.out.printf( "Total: R$ %.2f%n", valorFinal );
			break;

		default:
			System.out.println("Não existe codigo informado");
			break;
		}
		sc.close();
		
//		if(cod == 1) {
//			valorFinal = quantidade * 4.00;
//			System.out.printf( "Total: R$ %.2f%n", valorFinal );	
//		}
//		else if( cod ==2) {
//			valorFinal = quantidade * 4.50;
//			System.out.printf( "Total: R$ %.2f%n", valorFinal );	
//		}
//		else if( cod ==3) {
//			valorFinal = quantidade * 5.00;
//			System.out.printf( "Total: R$ %.2f%n", valorFinal );	
//		}
//		else if( cod ==4) {
//			valorFinal = quantidade * 2.00;
//			System.out.printf( "Total: R$ %.2f%n", valorFinal );	
//		}
//		else if( cod ==5) {
//			valorFinal = quantidade * 1.50;
//			System.out.printf( "Total: R$ %.2f%n", valorFinal );	
//		}else {
//			System.out.println("Não existe codigo informado");
//		}
	}

}
