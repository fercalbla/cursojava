class CambiarVariable{
	public static void main(String[] args){
		//Definida como char con codigo ascii
		char var1 = 0x6B;
		System.out.println("Tipo char: " +  var1 );
		//Definida como String
		String var2 = "Damn son";
		System.out.println( "Tipo String: " +  var2 );
		//Definida como long
		long var3 = 2^63-1;
		System.out.println( "Tipo long: " + var3 );
		//Definida como double
		double var4 = 0.003;
		System.out.println( "Tipo double: " +  var4 );
		//Definida como float. OJO, HAY QUE PONER f AL FINAL
		float var5 = 0.2f;
		System.out.println( "Tipo float: " + var5 );
		//Definida como short
		short var6 = -32768;
		System.out.println( "Tipo short: " + var6 );
		//Definida como byte
		byte var7 = 127;
		System.out.println( var7 );
		//Definida como int
		int var8 = 12313891;
		System.out.println( var8 );
		//Definida como boolean
		boolean var9 = true;
		if(var9 == true){
			System.out.println("Es verdadero");
		}else{
			System.out.println("Es falso");
		}
		// Mi nombre en HEX
	 	char F = 0x46; char e = 0x65; char r = 0x72; char n = 0x6E; char d = 0x64; char C = 0103; char a = 0141; char l = 0154; char v = 0166; char o = 0157; char space = 0040;
		System.out.println("Mi nombre ser: " + F + e + r + n + a + n + d + o +  space + C + a + l + v + o  );
	}
}
