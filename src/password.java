
public class password {

	// attributes

	private static int longitud = 8;
	private static String contraseña = "";

	// constructors

	public password() {

	}

	public password(int longitud) {
		this.setLongitud(longitud);
		this.contraseña = generarPassword();
	}

	// setters

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	// getters

	public int getLongitud() {
		return this.longitud;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	// methods

	public String esFuerte() {

		int minuscula = 0;
		int mayuscula = 0;
		int numeros = 0;

		for(int i = 0; i < this.longitud; i++){
			if(this.contraseña.charAt(i) >= 'A' && this.contraseña.charAt(i) <= 'Z'){
				mayuscula++;
			}
		}

		for(int i = 0; i < this.longitud; i++){
			if(this.contraseña.charAt(i) >= 'a' && this.contraseña.charAt(i) <= 'z'){
				minuscula++;
			}
		}

		for(int i = 0; i < this.longitud; i++){
			if(this.contraseña.charAt(i) >= '0' && this.contraseña.charAt(i) <= '9'){
				numeros++;
			}
		}


		if (minuscula > 1 && mayuscula > 2 && numeros > 5) {
			return "Es fuerte";
		} else {
			return "No es fuerte";
		}
	}

	public String generarPassword() {
		String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZqwertyuiopasdfghjklñzxcvbnm1234567890";
		contraseña = "";
		for (int i = 0; i < this.longitud; i++) {
			contraseña = contraseña + letras.charAt((int) (Math.random() * letras.length()));
		}
		return contraseña;
	}

}
