package aulas;

public class operacoesMat {

	public static void main(String[] args) {

			/*double x = 3.0;
			double y = 4.0;
			double z = -5.0;
			double A, B, C;
			
			A = Math.sqrt(x);
			B = Math.sqrt(y);
			C = Math.sqrt(25.0);

			System.out.println("Raiz quadrada de " + x + " = " + A);
			System.out.println("Raiz quadrada de " + y + " = " + B);
			System.out.println("Raiz quadrada de 25 = " + C);
			
			A = Math.pow(x, y);
			B = Math.pow(x, 2.0);
			C = Math.pow(5.0, 2.0);
			
			System.out.println(x + " elevado a " + y + " = " + A);
			System.out.println(x + " elevado ao quadrado = " + B);
			System.out.println("5 elevado ao quadrado = " + C);
			
			A = Math.abs(y);
			B = Math.abs(z);
			
			System.out.println("Valor absoluto de " + y + " = " + A);
			System.out.println("Valor absoluto de " + z + " = " + B);
			*/
			System.out.println("Calculando bhaskara: 3x^2-15x + 12 = 0");
			
			
			double delta, x, y , a, b, c;

			 System.out.println("delta = b^2 -4*a*c;");
			 a = 3;
			 b = -15;
			 c = 12;
			 System.out.println("a= " + a);
			 System.out.println("b="+ b);
			 System.out.println("c="+ c);
			 
			 delta = Math.pow(b, 2) - 4*a*c;
			 
			 System.out.println("delta é igual a: " + delta);
			 
			 double resDelta;
			 resDelta = Math.sqrt(delta);
			 
			 x = (-b- resDelta)/(2*a) ;                                                        
			 			 
			 System.out.println("x = (-b- resDelta)/(2*a)");
			 System.out.println("X =" + x);
			 
			 y = (-b + resDelta)/(2*a) ; 
			 System.out.println("y = (-b + resDelta)/(2*a)");
			 System.out.println( "Y =" + y);

			

	}

}
