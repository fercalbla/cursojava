/* dado un numero cualquiera, el programa debe detectar si el numero es 0, par o impar.*/
public class EjercicioIf{
	public static void main(String[] args){
		/*int theNumber = Integer.parseInt(args[0]);

		int esPar = theNumber % 2;*/

		int randomNumber = (int)(10 * Math.random());

		int esPar = randomNumber % 2;

		if(randomNumber <= 0){
			System.out.println("El numero " + randomNumber + " es menor o igual que cero.");
		}else if(esPar == 0){
			System.out.println("El numero " + randomNumber + " es par.");
		}else{
			System.out.println("El numero " + randomNumber + " es impar.");
		}

	}
}