public class AprobadoSuspendido{
	public static void main(String[] args){
		//Variables
		int calificacion = Integer.parseInt(args[0]);
		String calificacionTexto = "";

		switch(calificacion){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				calificacionTexto = "suspenso.";
				break;
			case 5:
				calificacionTexto = "aprobado.";
				break;
			case 6:
				calificacionTexto = "bien.";
				break;
			case 7:
			case 8:
				calificacionTexto = "notable.";
				break;
			case 9:
			case 10:
				calificacionTexto = "sobresaliente.";
				break;
			default:
				System.out.println("El valor introducido no es valido.");
				//El return sirve para que el programa pare.
				return;
		}

		System.out.println("Tu calificacion es " + calificacion + " lo cual significa que tienes un " + calificacionTexto);
	}
}