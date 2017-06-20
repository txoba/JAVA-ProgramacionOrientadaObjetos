
public class electro {

	// attributes

	private double precio = 100;
	private String color = "blanco";
	private char consumo = 'f';
	private double peso = 5;

	// constructors

	public electro() {

	}

	public electro(double precio, double peso) {
		this.setPrecio(precio);
		this.setPeso(peso);
	}
	
	public electro(double precio,String color,char consumo,double peso) {
		this.setPrecio(precio);
		this.setColor(color);
		this.setConsumo(consumo);
		this.setPeso(peso);
	}
	
	//1 objecte amb cada constructor

	// setters

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setColor(String color) {
		comprobarColor(color);
	}
	public void setConsumo(char consumo) {
		comprobarConsumoEnergetico(consumo);
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	

	// getters

	public double getPrecio() {
		return this.precio;
	}
	public String getColor() {
		return this.color;
	}
	public char getConsumo() {
		return this.consumo;
	}
	public double getPeso() {
		return this.peso;
	}


	// methods

	public void comprobarConsumoEnergetico (char consumo){
		if(consumo!='a' && consumo!='b' && consumo!='c' && consumo!='d' && consumo!='e' && consumo!='f'){
			this.consumo = 'f';
		}
		else{
			this.consumo=consumo;
		}
	}
	
	public void comprobarColor (String color){
		if(!color.equals("blanco") && !color.equals("negro") &&!color.equals("azul") &&!color.equals("rojo") &&!color.equals("gris")){
			this.color = "blanco";
		}
		else{
			this.color=color;
		}
	}
	
	//comprobar metode color
	
	public double precioFinal(){
		
		double preciofinal = 0;
		
		if(this.consumo=='a'){
			preciofinal = this.precio + 100;
		}
		if(this.consumo=='b'){
			preciofinal = this.precio + 80;
		}
		if(this.consumo=='c'){
			preciofinal = this.precio + 60;
		}
		if(this.consumo=='d'){
			preciofinal = this.precio + 50;
		}
		if(this.consumo=='e'){
			preciofinal = this.precio + 30;
		}
		if(this.consumo=='f'){
			preciofinal = this.precio + 10;
		}
		if(this.peso>0 && this.peso<20){
			preciofinal = preciofinal + 10;
		}
		if(this.peso>19 && this.peso<50){
			preciofinal = preciofinal + 50;
		}
		if(this.peso>49 && this.peso<80){
			preciofinal = preciofinal + 80;
		}
		if(this.peso>79){
			preciofinal = preciofinal + 100;
		}
		
		return preciofinal;
	}

}
