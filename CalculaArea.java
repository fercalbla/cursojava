public class CalculaArea{
	public static void main(String[] args){
		//Parametros, uso double para poder usar comas y para que la operacion acepte PI
		double parametro = Double.parseDouble(args[1]);
		double operacion = 0;

		//El switch lee el argumento uno y distingue el nombre del poligono
		switch(args[0]){
			case "circulo":
				operacion = Math.PI * Math.pow(parametro, 2);
				break;
			case "cuadrado":
				operacion = Math.pow(parametro, 2);
				break;
			case "triangulo":
				operacion = (Math.sqrt(3) / 4) * Math.pow(parametro, 2);
				break;
			default:
				System.out.println("No has introducido un poligono valido.");
				//Se usa return para que no se imprima el texto de abajo
				return;
		}

		//Imprime el area de los poligonos
		System.out.println("El area del " + args[0] + " es: " + operacion);
	}
}