package interfaces;

import model.DTO.Ejemplar;
import model.DTO.Elemento;
import model.DTO.Usuario;

public interface iBiblioteca {
	//Elementos
	boolean addElement(Elemento elemento);
	Elemento findElement(int cod);
	boolean deleteElement(Elemento elemento);
	String showAllElements();
	boolean isMagazine();
	//Usuarios
	boolean addUser(Usuario usuario);
	Usuario findUser(String dni);
	boolean deleteUser(Usuario usuario);
	String showAllUsers();
	//Prestamos
	boolean prestoEjemplar(Ejemplar e, Usuario u);
	boolean entregaEjemplar(Ejemplar e, Usuario u);



	
	
}
