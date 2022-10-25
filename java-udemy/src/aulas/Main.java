package aulas;

public class Main {

	public static void main(String[] args) {
		System.out.println("Casos calculados com numeros inteiros");
		System.out.println("Primeira resolução");
		int base1 = 6;
		int base2 = 8;
		int altura = 5;
		
		int soma = base1 + base2;
		System.out.println(soma);
		int divisao = soma / 2;
		System.out.println(divisao);
		
		int resultado = divisao * altura;
		
		System.out.println("Resposta1 = " + resultado);
		
		System.out.println("Segunda resolução");
		
		int baseA = 6;
		int baseB = 8;
		int alturaH = 5;
		
		int area = (baseA + baseB) / 2 * alturaH;
		System.out.println("(baseA + baseB) / 2 * alturaH");
		System.out.println("Resposta2 = " + area);
		
		System.out.println("Casos calculados com numeros decimais");
		System.out.println("Teste se usar a variavel int");
		
		int numero1 = 5;
		int numero2 = 2;
		System.out.println( numero1 + "/" + numero2 );
		
		int resposta = numero1 / numero2 ; 
		
		System.out.println("Resultado: " + resposta);
		
		System.out.println("Teste se usar a variavel double");
		System.out.println( numero1 + "/" + numero2 );
		
		double respostaCorreta = numero1 / numero2 ; 
		
		System.out.println("Resultado: " + respostaCorreta);
		
		//Simplificando as declarações:
		// int numero1, numero2;
		//double respostaCorreta;
		
		System.out.println("Usando o casting, que é declarar novo valor de variavel no resultado");
		
		double a ,b;
		int resultadoSoma ;
		
		a = 2.4;
		b = 3.5;
		resultadoSoma = (int) (a + b);
		System.out.println("resultadoSoma = (int) (a + b)");
		System.out.println(resultadoSoma);
		

	}

}
