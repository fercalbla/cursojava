public class Ternario2{
	public static void main(String[] args){
		String decision1;
		String decision2;
		boolean decidir1 = Boolean.parseBoolean(args[0]);
		boolean decidir2 = Boolean.parseBoolean(args[1]);

		decision1 = (decidir1 ? (decidir2 ? "Decision resuelta completamente":"Decision resuelta parcialmente"):"Decision no resuelta.");

		System.out.println(decision1);


		//El metodo de abajo es valido tambien pero utiliza dos variables.
		/*
		decision2 = decidir2 ? "Dicision resuelta completamente.":"Decision resuelta parcialmente.";

		decision1 = decidir1 ? decision2:"Decision no resuelta.";

		System.out.println(decision1);*/
	}
}