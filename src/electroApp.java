
public class electroApp {

	public static void main(String[] args){
		
		electro micro = new electro(200, "Azul", 'b', 6);
		electro nevera = new electro();
		electro horno = new electro(300, "Verde", 't', 8);
		electro lavavajillas = new electro(130, 9);
		
		System.out.println("Precio: "+ micro.getPrecio()+", Color: "+micro.getColor()+", Consumo: "+micro.getConsumo()+", Peso: " +micro.getPeso());
		System.out.println("Precio: "+ nevera.getPrecio()+", Color: "+nevera.getColor()+", Consumo: "+nevera.getConsumo()+", Peso: " +nevera.getPeso());
		System.out.println("Precio: "+ horno.getPrecio()+", Color: "+horno.getColor()+", Consumo: "+horno.getConsumo()+", Peso: " +horno.getPeso());
		System.out.println("Precio: "+ lavavajillas.getPrecio()+", Color: "+lavavajillas.getColor()+", Consumo: "+lavavajillas.getConsumo()+", Peso: " +lavavajillas.getPeso());
		System.out.println("Precio final: "+micro.precioFinal());
		System.out.println("Precio final: "+lavavajillas.precioFinal());
		System.out.println("Precio final: "+nevera.precioFinal());
		

	}
	
}
