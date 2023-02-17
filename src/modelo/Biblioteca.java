package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import interfaces.iBiblioteca;
import model.DTO.Ejemplar;
import model.DTO.Elemento;
import model.DTO.Prestamo;
import model.DTO.Revista;
import model.DTO.Usuario;
import utils.Utils;


public class Biblioteca implements iBiblioteca{
	
	protected final int limite = 200;
	
	
	private ArrayList <Elemento> ejemplares = new ArrayList <Elemento>();
	private ArrayList <Usuario> usuarios = new ArrayList <Usuario>();
	private ArrayList <Prestamo> prestamos = new ArrayList <Prestamo>();
	
	//METODOS ELEMENTO
	
	/**
	 * Función que añade un elemento al ArrayList.
	 */

	@Override
	public boolean addElement(Elemento elemento) {
		boolean valid = false;
		if(!ejemplares.contains(elemento) && findElement(elemento.getCod())==null) {
			ejemplares.add(elemento);
			valid=true;
		}
		return valid;
	}
	
	
	
	@Override
	public Elemento findElement(int cod) {
		Elemento e=null;
		for(Elemento elemento: ejemplares) {
			if(elemento.getCod()==cod) {
					e=elemento;
			}
		}
		return e;
	}
	
	/**
	 * Función que elimina un elemento del ArrayList
	 */
	
	@Override
	public boolean deleteElement(Elemento elemento) {
		
		boolean valid=false;
		if(ejemplares.contains(elemento)) {
			ejemplares.remove(elemento);
			valid=true;
			Utils.print("Eliminado correctamente.");
		}else {
			Utils.print("No se ha eliminado.");
		}
		return valid;
	}
	
	/**
	 * Función utiliada para diferenciar el tipo de objeto
	 */
	public boolean isMagazine() {
		boolean valid= false;
		for(Elemento e: ejemplares) {
			if(e instanceof Revista) {
				valid=true;
			}
		}
		return valid;
	}
	
	//METODOS USUARIO
	
	/**
	 * Función que añade un Usuario al ArrayList
	 */
	
	@Override
	public boolean addUser(Usuario usuario) {
		boolean valid = false;
		if(!usuarios.contains(usuario)) {
			usuarios.add(usuario);
			valid=true;
		}
		return valid;
	}
	
	/**
	 * Función que busca un usuario por su dni y si lo encuentra lo devuelve
	 */
	
	@Override
	public Usuario findUser(String dni) {
		Usuario u=null;
		for(Usuario usuario: usuarios) {
			if(usuario.getDni().equals(dni)) {
					u=usuario;
					break;
			}else {
				Utils.print("No se encuentra el elemento introducido");
			}
		}
		return u;
	}
	/**
	 * Función que elimina un usuario
	 */
	@Override
	public boolean deleteUser(Usuario usuario) {
		
		boolean valid=false;
		if(usuarios.contains(usuario)) {
			usuarios.remove(usuario);
			valid=true;
			Utils.print("Eliminado correctamente.");
		}else {
			Utils.print("No se ha eliminado.");
		}
		return valid;
	}
	
	/**
	 * Función que muestra todos los Elementos del ArrayList
	 */
	
	@Override
	public String showAllElements() {
		String result="";
		for(Elemento e: ejemplares) {
			if(e!=null) {
				result+=e+"\n";
			}
		}
		return result;
	}
	
	/**
	 * Funcion que muestra todos los Usuarios del ArrayList
	 */
	
	@Override
	public String showAllUsers() {
		String result="";
		for(Usuario u: usuarios) {
			if(u!=null) {
				result+=u+"\n";
			}
		}
		return result;
	}
	
	/**
	 * Función que añade un nuevo prestamo
	 */
	
	
	@Override
	public boolean prestoEjemplar(Ejemplar e, Usuario u) {
		if(e.isPrestado()) {
			return false;
		}
        Prestamo p = new Prestamo(u,e);
        this.prestamos.add(p);
        e.setPrestado(true);
        e.setFechaPrestamo(LocalDate.now());
        return true;
	}
	
	/**
	 * Función boolean que se encarga de eliminar un ejemplar
	 */
	
	@Override
	public boolean entregaEjemplar(Ejemplar e, Usuario u) {
		Prestamo p = new Prestamo(u,e);
        if(!this.prestamos.contains(p)) return false;
        this.prestamos.remove(p);
        int i = this.ejemplares.indexOf(e);
        if(i>=0) {
            Ejemplar ej=(Ejemplar)(this.ejemplares.get(i));
            ej.setPrestado(false);
        }
        return true;
	}

	/** Funcion que muestra todos los prestamos del ArrayList
	 * 
	 * @return devuelve un String con todos los prestamos
	 */
	
	public String showAllPrestamos() {
		String result="";
		for(Prestamo p:prestamos) {
			if(p!=null) {
				result+=p+"\n";
			}
		}
		return result;
	}
	
	
}
