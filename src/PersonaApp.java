
public class PersonaApp {

	public static void main(String[] args){
		
		persona persona1 = new persona();
		System.out.println(persona1.getNombre()); 
		
		persona persona2 = new persona("lo que sea", 3, 'M');
		System.out.println(persona2.getNombre()); 
		System.out.println(persona2.getPeso()); 
		System.out.println(persona2.getDni()); 
		//persona2.setSexo('O');
		System.out.println("Sexo: " + persona2.getSexo());
		System.out.println(persona2.tostring());
		persona2.setPeso(62.5);
		persona2.setAltura(1.70);
		System.out.println("IMC: " + persona2.IMC());
	}
	
}
