public class EsteIf{
	public static void main(String[] args){
		int miVar = Integer.parseInt(args[0]);

		if(miVar > 5){
			System.out.println("La variable es mayor que 5.");
		}else if(miVar == 5){
			System.out.println("La variable es igual a 5.");
		}else{
			System.out.println("La variable es menor que 5.");
		}
	}
}