package aulas;

import java.time.ZonedDateTime;
import java.util.Scanner;
//importa��o de entrada do usu�rio.

public class exerc_EntradadeDados1 {

	public static void main(String[] args) {
		//string = sc.next();
		//Int = sc.nextInt();
		//double = sc.nextDouble();
		//at� quebrar a linha = sc.nextLine();
		
		System.out.println("Bom dia, qual o seu nome?");
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		
		System.out.println("Qual ano voc� nasceu?(com 4 digitos AAAA)");
		int ano = sc.nextInt();
		System.out.println("Qual m�s voc� nasceu?(com 2 digitos MM)");
		int mes = sc.nextInt();
		
		ZonedDateTime dataAtual = ZonedDateTime.now();		
		int anoAtual = dataAtual.getYear();
		int mesAtual = dataAtual.getMonthValue();
		
		System.out.printf("Hoje �: %d/%d%n" , mesAtual, anoAtual);

		int idade = anoAtual - ano;
		int meses = mesAtual - mes;
		
		System.out.println("Ent�o "+ nome + " voc� tem: " + idade + " anos e " + meses + " meses ");		
		
        sc.close(); //n�o esquecer de fechar.        
        
	}

}
