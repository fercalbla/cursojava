public class HoraDia{
	public static void main(String[] args){
		//Variables
		int hora = Integer.parseInt(args[0]);
		int minutos = Integer.parseInt(args[1]);
		String horaPrint = args[0];
		String minutosPrint = args[1];
	
		//Estas variables se encargan de obtener el tamaño		
		int sizeHora = horaPrint.length();
		int sizeMinutos = minutosPrint.length();

		//Mensajes de error en argumentacion, esto se coloca lo primero para evitar ejecutar ninguna funcion.
		if(sizeHora != 2 || sizeMinutos != 2){
			System.out.println("Las hora debe ser introducida en formato digital separando horas y minutos por un espacio.");
			return;
		}

		//Mensajes especiales, los return los usamos para que no se ejecute el codigo de abajo y haya optimizacion
		if(hora == 12 && minutos == 00){
			System.out.println("Son las " + horaPrint + ":" + minutosPrint + " y es mediodia.");
			return;
		}else if(hora == 00 && minutos == 00){
			System.out.println("Son las " + horaPrint + ":" + minutosPrint + " y es medianoche.");
			return;
		}

		//A partir de aqui se inicializa la variable momento
		String momento = "";

		//Mensajes de momento del dia
		if((hora >= 00 && minutos >= 01) && (hora <= 05 && minutos <= 59)){
			momento = "madrugada.";
		}else if((hora >= 06 && minutos >= 00) && (hora <= 11 && minutos <= 59)){
			momento = "mañana.";
		}else if((hora >= 12 && minutos >= 01) && (hora <= 19 && minutos <= 59)){
			momento = "tarde.";
		}else if((hora >= 20 && minutos >= 00) && (hora <= 23 && minutos <= 59)){
			momento = "noche.";
		}

		//Mensaje lanzado con hora y minutos
		System.out.println("Son las " + horaPrint  + ":" + minutosPrint + " de la " + momento);
	}
}
