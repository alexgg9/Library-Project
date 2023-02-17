package model.DTO;

public class Revista extends Elemento {
	
	private int numEdicion;


	public Revista() {
		this.numEdicion=0;
	}
	public Revista(int codigo,String titulo,int numEdicion) {
		super(codigo,titulo);
		this.numEdicion = numEdicion;
	}

	public int getNumEdicion() {
		return numEdicion;
	}

	public void setNumEdicion(int numEdicion) {
		this.numEdicion = numEdicion;
	}
	
	@Override
	public String toString() {
		 	
		return	"\nREVISTA" +
				super.toString()+ 
				"\nNúmero de Edición: " + numEdicion;
	}
	
	
	
	
}
