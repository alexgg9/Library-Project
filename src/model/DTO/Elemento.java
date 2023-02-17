package model.DTO;


public class Elemento{
	private int cod;
	private String titulo;
	
	
	

	public Elemento() {

		this.cod=0;
		this.titulo="";
	}

	
	public Elemento(int cod, String titulo) {
		this.cod = cod;
		this.titulo = titulo;
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	@Override
	public String toString() {
		return 	"\n          "+			
				"\nCódigo: " +cod +
				"\nTítulo: " + titulo;
	}


	


	
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		
		if(obj==this) { //comparando el objeto recibido con la instancia(this), si la zona de memoria es la misma da true
			result = true;
		} else {
			if(obj!=null && obj.getClass()==this.getClass()) {
				Elemento e = (Elemento)obj;
				if(this.cod==e.getCod()) {
					result=true;
				}
			}
		}
		
		return result;
	}


	
	

	
	

	

	
	
}
