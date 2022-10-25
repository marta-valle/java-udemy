package aulas;

import java.time.ZonedDateTime;
import java.util.Scanner;
//importação de entrada do usuário.

public class exerc_EntradadeDados1 {

	public static void main(String[] args) {
		//string = sc.next();
		//Int = sc.nextInt();
		//double = sc.nextDouble();
		//até quebrar a linha = sc.nextLine();
		
		System.out.println("Bom dia, qual o seu nome?");
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		
		System.out.println("Qual ano você nasceu?(com 4 digitos AAAA)");
		int ano = sc.nextInt();
		System.out.println("Qual mês você nasceu?(com 2 digitos MM)");
		int mes = sc.nextInt();
		
		ZonedDateTime dataAtual = ZonedDateTime.now();		
		int anoAtual = dataAtual.getYear();
		int mesAtual = dataAtual.getMonthValue();
		
		System.out.printf("Hoje é: %d/%d%n" , mesAtual, anoAtual);

		int idade = anoAtual - ano;
		int meses = mesAtual - mes;
		
		System.out.println("Então "+ nome + " você tem: " + idade + " anos e " + meses + " meses ");		
		
        sc.close(); //não esquecer de fechar.        
        
	}

}
