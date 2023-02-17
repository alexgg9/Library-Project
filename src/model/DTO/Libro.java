package model.DTO;

import java.time.LocalDate;

public class Libro extends Elemento{
	
	private int anoPublic;
	private int ISBN;
	private boolean prestado;
	private LocalDate fechaPrestamo;
	

	
	public Libro() {
		super();
		this.anoPublic = 1000;
		this.ISBN = 000000;
		this.prestado=false;
		this.fechaPrestamo=null;


	}

	
	public Libro(int cod,String titulo, int anoPublic, int ISBN, boolean prestado, LocalDate fechaPrestamo) {
		super(cod,titulo);
		this.anoPublic = anoPublic;
		this.ISBN = ISBN;
		this.prestado=prestado;
		this.fechaPrestamo=fechaPrestamo;

	}

	
	public int getAnoPublic() {
		return anoPublic;
	}
	public void setAnoPublic(int anoPublic) {
		this.anoPublic = anoPublic;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	
	public boolean isPrestado() {
		return prestado;
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}


	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}


	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}


	@Override
	public String toString() {
		return 	"\n            "+
				"\nEJEMPLAR    "+
				super.toString()+ 
				"\nAno de Publicación: " + anoPublic + 
				"\nPrestado: " + anoPublic +
				"\nFecha Prestamo: " + fechaPrestamo +
				"\nISBN: " + ISBN;
		
		
	}
	
	
	
	
	
	
	
	
}
