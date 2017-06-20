import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class passwordApp {

	public static void main(String[] args) {

		try {

			int p = 0;
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Tamaño Array: ");
			p = Integer.parseInt(buffer.readLine());
			System.out.println("Long de cada contraseña");
			int longitud = Integer.parseInt(buffer.readLine());
			ArrayList<password> password1 = new ArrayList<password>();
			for (int i = 0; i < p; i++) {
				password pass = new password(longitud);
				password1.add(pass);
				System.out.println(password1.get(i).getContraseña() + " " + password1.get(i).esFuerte());
			}

		} catch (Exception e) {

			System.out.println("Error " + e);
		}
	}

}
