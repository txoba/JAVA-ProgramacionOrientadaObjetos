
public class menuApp {

	public static void main(String[] args) {

		try{

			menu Stamppot = new menu("Stamppot", 564.65, 54, 20.5, 0.5);
			menu Metworst = new menu("Metworst", 345, 12, 10.99, 0);
			menu Hutspot = new menu("Hutspot", 560.4, 65, 30.9, 1);
			menu Biefstuk = new menu("Biefstuk", 780, 46, 50.34, 2);
			menu Kibbeling = new menu("Kibbeling", 450.4, 23, 20.78, 1);

			menu[] menus = {Stamppot,Metworst,Hutspot,Biefstuk,Kibbeling};

			for (int i = 0; i < menus.length; i++) {

				if(menus[i].getMinutes()<30){
					System.out.println("El plato " + menus[i].getName() + " tarda " + menus[i].getMinutes() + " minutos en cocinarse.");
				}
			}

			double suma1 = 0;			
			for (int i = 0; i < menus.length; i++) {				
				suma1 = menus[i].getPrice() + suma1;			
			}	
			
			System.out.println("El preu total es: " + suma1);
			if(suma1>65){
				suma1 = suma1*0.9;
				System.out.println("Amb descompte: " + suma1);
			}





		}

		catch (Exception e){
			System.out.println("Error " + e);
		}
	}
}