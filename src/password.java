
public class password {

	// attributes

	private static int longitud = 8;
	private static String contrase�a = "";

	// constructors

	public password() {

	}

	public password(int longitud) {
		this.setLongitud(longitud);
		this.contrase�a = generarPassword();
	}

	// setters

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	// getters

	public int getLongitud() {
		return this.longitud;
	}

	public String getContrase�a() {
		return this.contrase�a;
	}

	// methods

	public String esFuerte() {

		int minuscula = 0;
		int mayuscula = 0;
		int numeros = 0;

		for(int i = 0; i < this.longitud; i++){
			if(this.contrase�a.charAt(i) >= 'A' && this.contrase�a.charAt(i) <= 'Z'){
				mayuscula++;
			}
		}

		for(int i = 0; i < this.longitud; i++){
			if(this.contrase�a.charAt(i) >= 'a' && this.contrase�a.charAt(i) <= 'z'){
				minuscula++;
			}
		}

		for(int i = 0; i < this.longitud; i++){
			if(this.contrase�a.charAt(i) >= '0' && this.contrase�a.charAt(i) <= '9'){
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
		String letras = "ABCDEFGHIJKLMN�OPQRSTUVWXYZqwertyuiopasdfghjkl�zxcvbnm1234567890";
		contrase�a = "";
		for (int i = 0; i < this.longitud; i++) {
			contrase�a = contrase�a + letras.charAt((int) (Math.random() * letras.length()));
		}
		return contrase�a;
	}

}
