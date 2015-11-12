public class Ternario1{
	public static void main(String[] args){
		String salir;
		boolean pandilla = true;
		boolean dinero = true;
		boolean zona = false;

		salir = zona && (pandilla || dinero) ? "Ole salimos de copas":"Ni un rosco";
		System.out.println(salir);
	}
}