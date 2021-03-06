public class Calculadora1{
	public static void main(String[] args){
		/*
		1er param: operando 1
		2do param: 1 suma, 2 restar, 3 multiplicar, 4 dividir (intentalo con los operandos en vez de numeros)
		3er param: operando 2

		salida: valores de los parametros y resultado.
		*/
		
		char operador = args[1].charAt(0);
		int operandoUno = Integer.parseInt(args[0]);
		int operandoDos = Integer.parseInt(args[2]);

		int operacion;

		switch(operador){
		case 'x':
			operacion = operandoUno * operandoDos;
			System.out.println(operandoUno + " " + operador + " " + operandoDos + " es igual a " + operacion);
			break; 
		case '/':
			operacion = operandoUno / operandoDos;
			System.out.println(operandoUno + " " + operador + " " + operandoDos + " es igual a " + operacion);
			break; 
		case '+':
			operacion = operandoUno + operandoDos;
			System.out.println(operandoUno + " " + operador + " " + operandoDos + " es igual a " + operacion);
			break; 
		case '-':
			operacion = operandoUno - operandoDos;
			System.out.println(operandoUno + " " + operador + " " + operandoDos + " es igual a " + operacion);
			break; 
		default:
			System.out.println("El operador es invalido.");
			break; 
		}

	}
}
