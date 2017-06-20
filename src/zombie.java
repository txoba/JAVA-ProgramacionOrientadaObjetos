
public class zombie {

	// attributes

	private String nombre = "";
	private int año = 0;
	private int nivel = 1;
	private int[] conversiones = new int [5];

	// constructors

	public zombie() {
	
	}
	
	public zombie(String nombre, int año, int nivel, int[] conversiones) {
		this.setnombre(nombre);
		this.setaño(año);
		this.setnivel(nivel);
		this.setconversiones(conversiones);
	}

	// setters

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public void setaño(int año) {
		comprobarAnyo(año);
	}
	public void setnivel(int nivel) {
		comprobarNivel(nivel);
	}
	public void setconversiones(int[] conversiones) {
		this.conversiones = conversiones;
	}
	
	// getters

	public String getnombre() {
		return this.nombre;
	}
	public int getaño() {
		return this.año;
	}
	public int getnivel() {
		return this.nivel;
	}	
	public int[] getconversiones() {
		return this.conversiones;
	}

	// methods
	
	public int mejorAnyo(){
		int max = Integer.MIN_VALUE;
		int anyomax = 0;
		for (int i = 0; i < conversiones.length; i++) {
			if(conversiones[i]>max){
				max = conversiones[i];
				anyomax = i+1;
			}
		}
		return anyomax;
	}
	
	public int maxConversiones(){
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < conversiones.length; i++) {
			if(conversiones[i]>max){
				max = conversiones[i];
			}
		}
		return max;
	}
	
	public double mediaConversiones(){
		int con = 0;
		int num = 0;
		for (int i = 0; i < conversiones.length; i++) {
			if (conversiones [i] > 0) {
				con = con + conversiones [i];
				num++;
			}	
		}
		if (num > 0) return con/num;
		else return 0;
	}

	public int totalConversiones(){
		int con = 0;
		for (int i = 0; i < conversiones.length; i++) {
			con = con + conversiones [i];
		}
		return con;
	}
	
	public boolean haConvertido(){
		int con = 0;
		for (int i = 0; i < conversiones.length; i++) {
			con = con + conversiones [i];
		}
		return con > 0;
	}
	
	public boolean esJefe(){
		return nivel > 6;
	}
	
	public void comprobarNivel (int nivel){
		if(nivel<1 && nivel>10){
			this.nivel = 1;
		}
		else{
			this.nivel=nivel;
		}
	}
	
	public void comprobarAnyo (int año){
		if(año<1 && año>5){
			this.año = 1;
		}
		else{
			this.año=año;
		}
	}
	
	public void getcon() {		
      for (int i = 0; i < conversiones.length; i++) {
    	  System.out.println(conversiones[i]);
	  }
	}
	
	public void mostrar1(){
		System.out.println("Hola soy "+ this.nombre + ", tengo " + this.año + " años de conversion y me quedan " + (5-(this.año)) + " años para convertirme en una bonita flor.");
	}
	
	public void mostrar2(){
		System.out.println("Mi nombre: " + this.nombre);
		System.out.println("Mi mejor año: " + mejorAnyo());
		System.out.println("Maximo de conversiones en un año: " + maxConversiones());
		System.out.println("Media de conversiones por año: " + mediaConversiones());
		System.out.println("Total de conversiones: " + totalConversiones());
		if(haConvertido()){
			System.out.println("¿He convertido alguna vez? Si.");	
		}else{
			System.out.println("¿He convertido alguna vez? No.");	
		}
		if(esJefe()){
			System.out.println("¿Soy un jefe? Si.");
		}else{
			System.out.println("¿Soy un jefe? No.");
		}
	}
		
	

}
