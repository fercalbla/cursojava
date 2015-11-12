/*Yo tengo u  programa en el cual necesito conocer la salida para los casos en que se cumpla la condicion de o tengo dinero para salir o sale toda la pandilla y salga por la zona en la que vivo.*/

public class SalidaFiesta{
	public static void main(String[] args){

		

		boolean goOut;
		boolean hasMoney = Boolean.parseBoolean(args[0]);
		boolean allOut = Boolean.parseBoolean(args[1]);
		boolean myZone = Boolean.parseBoolean(args[2]);

		goOut = (hasMoney || allOut) && myZone;

		System.out.println( "Con los parametros dados obetenemos: " + goOut );

		/*hasMoney = true;
		allOut = true;
		myZone = false;

		goOut = (hasMoney || allOut) && myZone;

		System.out.println( "\nEn el caso de que tenga dinero y salga con mi pandilla, pero no por mi zona: " + goOut );

		hasMoney = true;
		allOut = false;
		myZone = true;

		goOut = (hasMoney || allOut) && myZone;

		System.out.println( "\nSi tengo dinero, pero no salimos todos y salimos por mi zona: " + goOut);
		if((hasMoney || allOut) && myZone){
			System.out.println("Hoy salgo.");
			goOut = true;
		}else{
			goOut = false;
			System.out.println("Hoy no salgo.");
		}*/
	}
}