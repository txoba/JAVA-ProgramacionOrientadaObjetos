public class serieApp {

	public static void main(String[] args) {

		try{

			int serie1[] = {20, 21, 24, 26};
			int serie2[] = {15, 15, 16, 14, 20};
			
			serie Walking = new serie("Walking Dead", serie1, "Miedo", "creador 1");
			serie Sons = new serie("Sons of Anarchy", serie2, "Drama", "creador 2");
			
			System.out.println("Titulo: "+ Walking.getTitulo()+", Temporadas: "+Walking.getNumTemporadas()+
					", Genero: "+Walking.getGenero()+", Creador: " +Walking.getCreador());
			
			System.out.println("Titulo: "+ Sons.getTitulo()+", Temporadas: "+Sons.getNumTemporadas()+
					", Genero: "+Sons.getGenero()+", Creador: " +Sons.getCreador());

			Walking.getCapitulos();
			Sons.getCapitulos();
		}
		catch (Exception e){
			System.out.println("Error " + e);
		}
	}
}