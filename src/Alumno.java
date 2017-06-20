class Alumno{

	// Modificar la clase alumno para que guarde 5 notas
	// Modificar la clase Alumno para que ahora sólo se guarde el número de DNI, no la letra
	// Añadir un constructor sin parámetros que cree un alumno con unos valores por defecto:
	// dni "00000000A", nombre "abc", edad 10, nota 0

	//Atributos
	private int dni;
	private String nombre;
	private int edad;
	private double nota;

	// Constructores

	// Constructor vacío
	public Alumno(){

	}

	// Constructor con parámetros
	public Alumno(int dniNuevo, String nombre, int edad, double nota){
		this.setDni(dniNuevo);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setNota(nota);
	}

	//Setters

	public void setDni(int dniNuevo){
		this.dni = dniNuevo;
	}
	public void setNombre(String nombreNuevo){
		this.nombre = nombreNuevo;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public void setNota(double nota){
		this.nota = nota;
	}

	//Getters

	public int getDni(){
		return this.dni;
	}
	public String getNombre(){
		return this.nombre;
	}
	public int getEdad(){
		return this.edad;
	}
	public double getNota(){
		return this.nota;
	}

	//Otros metodos de la clase

	public char generaLetra(){

		String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo= this.dni % 23;
		char letra = juegoCaracteres.charAt(modulo);
		return letra; 
	}

	public String mostrarInfo(){
		return ("El nombre es " + this.nombre + " y el DNI es " + this.dni + this.generaLetra());
				
	}
}