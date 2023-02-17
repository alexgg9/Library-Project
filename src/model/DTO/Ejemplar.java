package model.DTO;

import java.time.LocalDate;

public class Ejemplar extends Libro{
	private int numEstanteria;


	public Ejemplar() {
		super();
		this.numEstanteria=0;
		
	}

	

	public Ejemplar(int cod, String titulo, int anoPublic, int ISBN,boolean prestado,LocalDate fechaPrestamo,int numEstanteria) {
		super(cod,titulo,anoPublic,ISBN,prestado,fechaPrestamo);
		this.numEstanteria = numEstanteria;
	}

	public int getNumEstanteria() {
		return numEstanteria;
	}

	public void setNumEstanteria(int numEstanteria) {
		this.numEstanteria = numEstanteria;
	}

	




	@Override
	public String toString() {
		
		return 	super.toString() +
				"\nNúmero de Estanteria: " + numEstanteria+
				"\n                 ";
		
		
		
	}
	
	
	
	
	
}
