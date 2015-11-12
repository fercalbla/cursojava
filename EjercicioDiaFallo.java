/*var clase = true cuando tenemos todos los alumnos, todos los equipos, que el equipo no sea windows
O no viene nadie, pero que venga jose y sea windows*/
public class EjercicioDiaFallo{
	public static void main(String[] args){
		boolean classRun;
		boolean classPc = Boolean.parseBoolean(args[0]);
		boolean allPpl = Boolean.parseBoolean(args[1]);
		boolean isWindows = Boolean.parseBoolean(args[2]);
		boolean teacherCame = Boolean.parseBoolean(args[3]);

		System.out.println("Parametros dados -> Vienen todos: " + allPpl + " | Funcionan los equipos: " + classPc + " | Son Windows los equipos: " + isWindows + " | Ha venido Jose: " + teacherCame );

		System.out.println("\nCaso 1: Vienen todos los alumnos, funcionan todos los equipos y los equipos no son Windos.");
		classRun = ( classPc && allPpl && !isWindows ) || ( classPc && !allPpl && isWindows && teacherCame );

		System.out.println("¿Arranca el equipo? " + classRun);

		/*System.out.println("\nCaso 2: No viene nadie, funcionan todos los equipos, viene Jose y son Windows");
		classRun = classPc && !allPpl && isWindows && teacherCame;

		System.out.println("¿Arranca el equipo?" + classRun);*/

	}
}