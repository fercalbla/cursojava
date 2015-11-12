public class PruebaCasting{
	public static void main(String[] args){
		/****************
		Casting implicito
		*****************/
		System.out.println("Conversiones implicitas");
		//Long a Int
		long myLong = 120000000000L;
		int myInt = 120;

		System.out.println("Long: " + myLong);
		System.out.println("Int: " + myInt);

		//Float a Double
		float myFloat = 145.23F;
		double myDouble = 145.23;

		System.out.println("Float: " + myFloat);
		System.out.println("Double: " + myDouble);

		/****************
		Casting explicito
		*****************/
		System.out.println("\nConversiones explicitas");

		//Long a Int
		long otroLong = 120000000000L;
		int otroInt = (int) otroLong;

		System.out.println(otroInt);

		//Double a Float
		double otroDouble = 1234.45e-15;
		float otroFloat = (float) otroDouble;

		System.out.println(otroDouble);

		//Float a Int
		float esteFloat = 45.9999F;
		int esteInt = (int) esteFloat;

		System.out.println(esteInt);

		//Int a Char
		int hayInt = 122;
		char hayChar = (char) hayInt;

		System.out.println(hayChar);

		//Char a Int
		char alChar = 'z';
		int alInt = (int) alChar;

		System.out.println(alInt);
	}
}