import java.io.BufferedReader;
import java.io.InputStreamReader;

public class zombieApp {

	public static void main(String[] args) {

		try{
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			zombie zombie1 = new zombie();
			zombie zombie2 = new zombie();
			
			System.out.println("Nombre?");
			zombie2.setnombre(buffer.readLine());
			
			System.out.println("Cuantos años tienes?");
			zombie2.setaño(Integer.parseInt(buffer.readLine()));
			
			System.out.println("Nivel?");
			zombie2.setnivel(Integer.parseInt(buffer.readLine()));
			
			int[] var = new int [zombie2.getaño()];
			
			for (int i = 0; i < (zombie2.getaño()); i++) {
				System.out.println("Conversiones año "+(i+1)+"?");
				var[i]=(Integer.parseInt(buffer.readLine()));
			}
			
			zombie2.setconversiones(var);
			
			zombie1.mostrar1();
			
			zombie2.mostrar2();
		
		}
		catch (Exception e){
			System.out.println("Error " + e);
		}
	}
}