
public class serie {

	// attributes

	private String titulo = "";
	private int[] temporadas = new int [3];
	private boolean entregado = false;
	private String genero = "";
	private String creador = "";

	// constructors

	public serie() {

	}

	public serie(String titulo, String creador) {
		this.setTitulo(titulo);
		this.setCreador(creador);
	}
	
	public serie(String titulo,int[] temporadas, String genero, String creador) {
		this.setTitulo(titulo);
		this.setTemporadas(temporadas);
		this.setGenero(genero);
		this.setCreador(creador);
	}

	// setters

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setTemporadas(int[] temporadas) {
		this.temporadas = temporadas;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	

	// getters

	public String getTitulo() {
		return this.titulo;
	}
	public int[] getTemporadas() {
		return this.temporadas;
	}
	public String getGenero() {
		return this.genero;
	}
	public String getCreador() {
		return this.creador;
	}


	// methods
	public int getNumTemporadas() {
		return temporadas.length;
	}

	public void getCapitulos() {
		System.out.println(getTitulo());
		
      for (int i = 0; i < temporadas.length; i++) {
    	  System.out.println("Temporada "+(i+1)+ ": "+ temporadas [i] +" capitulos ");
	  }
	}
	
	
	

}
