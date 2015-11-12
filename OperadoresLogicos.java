public class OperadoresLogicos{
	public static void main(String[] args){
		boolean laRespuesta = true;
		boolean la2daRespuesta = true;

		if(!laRespuesta){
			System.out.println("La respuesta es falsa.");
		}else{
			System.out.println("La respuesta es verdadera.");
		}

		if(laRespuesta && la2daRespuesta){
			System.out.println("Ambas respuestas son verdaderas.");
		}else{
			System.out.println("Una o ambas respuestas son falsas.");
		}

		la2daRespuesta = false;

		if(laRespuesta || la2daRespuesta){
			System.out.println("Todas o alguna de las respuestas son verdaderas.");
		}else{
			System.out.println("Todas las respuestas son falsas.");
		}
	}
}