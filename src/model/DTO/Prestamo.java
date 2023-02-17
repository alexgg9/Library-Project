package model.DTO;

import java.util.Objects;
public class Prestamo {

	private Usuario usuario;
	private Ejemplar ejemplar;
	
	
	
	
	public Prestamo(Usuario usuario, Ejemplar ejemplar) {
		super();
		this.usuario = usuario;
		this.ejemplar = ejemplar;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Ejemplar getEjemplar() {
		return ejemplar;
	}
	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		return Objects.equals(ejemplar, other.ejemplar) && Objects.equals(usuario, other.usuario);
	}
	
	@Override
	public String toString() {
		return "Prestamo adquirido por: " + usuario + ejemplar;
	}
	
	
	
	
	
	
}
