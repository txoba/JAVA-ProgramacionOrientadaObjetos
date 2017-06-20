
public class menu {

	// attributes

	private String name = "";
	private double kcal = 0;
	private int minutes = 0;
	private double price = 0;
	private double wine = 0;

	// constructors

	public menu() {

	}

	public menu(String name, double kcal, int minutes, double price, double wine) {
		this.setName(name);
		this.setKcal(kcal);
		this.setMinutes(minutes);
		this.setPrice(price);
		this.setWine(wine);
	}

	// setters

	public void setName(String name) {
		this.name = name;
	}
	public void setKcal(double kcal) {
		this.kcal = kcal;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setWine(double wine) {
		this.wine = wine;
	}
	

	// getters

	public String getName() {
		return this.name;
	}
	public double getKcal() {
		return this.kcal;
	}
	public int getMinutes() {
		return this.minutes;
	}
	public double getPrice() {
		return this.price;
	}
	public double getWine() {
		return this.wine;
	}

	// methods

	public void printMenu() {
		System.out.println("Name " + this.name + " contains: " + this.kcal + " calories, comes with " + this.wine
				+ " bottles and cost " + this.price + ".");
		
	}

}
