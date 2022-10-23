package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numFunc , hTrab ;
		
		numFunc = sc.nextInt();
		hTrab = sc.nextInt();
		double valHora = sc.nextDouble();
		double sal;
		
		sal = hTrab * valHora;
		
		System.out.printf("NUMERO = %d%nSALARIO = U$ %.2f%n", numFunc , sal);


		sc.close();
	}
}