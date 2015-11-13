public class MiLetraDNI{
	public static void main(String[] args){
		if(((int)args[0].length()) != 8){
			System.out.println("El valor introducido en el argumento no es valido");
			return;
		}
		int numeroDNI = Integer.parseInt(args[0]);
		int moduloDNI = numeroDNI % 23;
		char letraDNI;

		switch(moduloDNI){
			case 0:
				letraDNI = 'T';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 1:
				letraDNI = 'R';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 2:
				letraDNI = 'W';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 3:
				letraDNI = 'A';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 4:
				letraDNI = 'G';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 5:
				letraDNI = 'M';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 6:
				letraDNI = 'Y';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 7:
				letraDNI = 'F';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 8:
				letraDNI = 'P';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 9:
				letraDNI = 'D';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 10:
				letraDNI = 'X';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 11:
				letraDNI = 'B';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 12:
				letraDNI = 'N';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 13:
				letraDNI = 'J';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 14:
				letraDNI = 'Z';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 15:
				letraDNI = 'S';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 16:
				letraDNI = 'Q';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 17:
				letraDNI = 'V';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 18:
				letraDNI = 'H';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 19:
				letraDNI = 'L';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 20:
				letraDNI = 'C';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 21:
				letraDNI = 'K';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			case 22:
				letraDNI = 'E';
				System.out.println("Al numero de DNI " + numeroDNI + " le corresponde la letra " + letraDNI);
				System.out.println("El DNI completo seria: " + numeroDNI + "" + letraDNI);
				break;
			default:
				System.out.println("¡Pero que vergüenza, hubo un error en el cálculo!");			
				break;
		}
	}
}
