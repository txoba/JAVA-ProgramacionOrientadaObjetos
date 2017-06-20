import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlumnoApp {

	public static void main(String[] args) {

		try{

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			// Crear un objeto alumno vacío

			Alumno Juan = new Alumno();

			// Crear un objeto alumno con valores definidos

			Alumno Pedro = new Alumno(47569787, "Pedro", 20, 5.7);
			
			System.out.println(Pedro.mostrarInfo());
			
			System.out.println("El DNI es " + Pedro.getDni() + Pedro.generaLetra());

			System.out.println(Juan.getEdad());
			System.out.println(Pedro.getEdad());

			Juan.setNombre("Jose");

			System.out.println(Juan.getNombre());

			// Modificar el primer alumno con valores pedidos por teclado 

			System.out.println("Nombre?");
			Juan.setNombre(buffer.readLine());

			System.out.println("DNI?");
			Juan.setDni(Integer.parseInt(buffer.readLine()));

			System.out.println("Edad?");
			Juan.setEdad(Integer.parseInt(buffer.readLine()));

			System.out.println("Nota?");
			Juan.setNota(Double.parseDouble(buffer.readLine()));

			System.out.println("Los nuevos datos son "+ Juan.getDni() + " " + Juan.getEdad() + " " + Juan.getNombre() + " " + Juan.getNota());

			// - Pedir DNI sin letra
			// - Comprobar DNI antes de añadirlo

			// Mostrar toda la información del alumno 1 con el método de mostrarInfo

			// Mostrar toda la información del alumno 2 con el método de mostrarInfo

		}
		catch (Exception e){
			System.out.println("Error " + e);
		}
	}
}