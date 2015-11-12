public class OperacionesEntreVariables{
	public static void main(String[] args){
		System.out.println("Aritmetica básica:");
		int[] num = {7, 11};
		double d = 25.4;
		
		System.out.println("B / A es:" + num[0]/num[1]);
		System.out.println("B % A es:" + num[0]%num[1]);
		System.out.println("D / A es: " + d/num[0]);
		System.out.println("B / A es: " + (double)num[1]/num[0]);
		System.out.println("B % A es: " + num[1]%num[0]);

		System.out.println("\nIncremento y decrecimiento de variables:");
		int[] num2 = {1, 1};
		
		System.out.println(num2[0]++);
		System.out.println(++num2[1]);
		System.out.println(num2[0]++);
		System.out.println(++num2[1]);
		
		System.out.println( "\nOperaciones con variables:" );
		int b = 1;
		System.out.println( b );
		b += 5;
		System.out.println( b );


	}	
}