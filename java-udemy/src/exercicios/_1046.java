package exercicios;

import java.util.Scanner;

public class _1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h_inicio = sc.nextInt();
		int h_final = sc.nextInt();
		int hora = h_inicio -h_final;
		
		if(hora == 0) {
			System.out.println("O JOGO DUROU " + 24 +" HORA(S)");
		}	
		else if(h_final > h_inicio) {
			hora *= -1;
			System.out.println("O JOGO DUROU " + hora +" HORA(S)");
		}
		else if(h_inicio > h_final) {
			hora = 24 - h_inicio + h_final;
			
			System.out.println("O JOGO DUROU " + hora + " HORA(S)");
		}	
	
		sc.close();
	}

}
