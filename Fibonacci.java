public class Fibonacci{
	public static void main(String[] args){
		int numeroTope = Integer.parseInt(args[0]);
		int f0 = 0;
		int f1 = 1;

		for(int f = 0; f < numeroTope;){
			f = f0 + f1;
			System.out.println(f0 + " + " + f1 + " es igual a " + f);
			f0 = f1; f1 = f;
		}
	}
}