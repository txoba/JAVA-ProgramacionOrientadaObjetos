
public class persona {

	//Atributos

	private String nombre = "";
	private int edad = 0;
	private String dni = "";
	private char sexo = 'H';
	private double peso = 0;
	private double altura = 0;

	
	//Construcotores

	public persona(){

	}

	public persona(String nombre, int edad, char sexo, double peso, double altura){		
		this.setNombre(nombre);
		this.setEdad(edad);
		generarDNI();
		this.setSexo(sexo);
		this.setPeso(peso);
		this.setAltura(altura);
	}

	public persona(String nombre, int edad, char sexo){		
		this.setNombre(nombre);
		this.setEdad(edad);
		generarDNI();
		this.setSexo(sexo);
	}

	
	//Getters

	public String getNombre(){
		return this.nombre;
	}
	public String getDni(){
		return this.dni;
	}
	public int getEdad(){
		return this.edad;
	}
	public char getSexo(){
		return this.sexo;
	}
	public double getPeso(){
		return this.peso;
	}
	public double getAltura(){
		return this.altura;
	}
	
	
	//Setters

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setDni(String dni){
		this.dni = dni;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public void setSexo(char sexo){
		if(sexo=='m' || sexo=='h' || sexo=='M' || sexo =='H') this.sexo = sexo;
		else this.sexo = 'H';
		
	}
	public void setPeso(double peso){
		this.peso = peso;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}

	
	//Metodo Generar DNI
	
	public void generarDNI(){
		int randomDNI = (int) (99999999*Math.random()+10000000);
		char letra = generaLetra(randomDNI);
		this.dni = Integer.toString(randomDNI)+ letra;
	}
	
	public static char generaLetra(int dni){
		String combinacionDNI="TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo= dni % 23;
		char letra = combinacionDNI.charAt(modulo);
		return letra; 
	}
	
	public int IMC (){
		double imc = this.peso / (this.altura * this.altura);
		// (MAth.pow(this.altura,2)
		if(imc < 18.5) return -1;
		if(imc < 25 && imc >= 18.5) return 0;
		if(imc > 25) return 1;
		return 0;
	}
	
	public boolean mayoriaEdad(){
		if (this.edad >= 18) return true;
		else return false;
	}
	
	public String tostring(){
		return("Nombre: " + this.nombre + ", DNI: " + this.dni + ", Edad: " + this.edad + 
				", Sexo: " + this.sexo + ", Peso: " + this.peso + ", Altura: " + this.altura);
	}

}
