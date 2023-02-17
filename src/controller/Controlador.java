package controller;

import interfaces.iBiblioteca;
import interfaces.iController;
import interfaces.iControllerElementos;
import interfaces.iControllerUsers;
import interfaces.iGUI;
import modelo.Biblioteca;
import utils.Utils;
import view.Vista;

public class Controlador implements iController{
	private iGUI mygui = new Vista();
	private iControllerElementos myconEle = new ControllerElements();
	private iControllerUsers myconUser = new ControllerUsers();
	private iBiblioteca myBiblio = new Biblioteca();
	
	//CONTROLADOR PRINCIPAL
	
	@Override
	public void controllerMainMenu(Biblioteca b) {
		boolean valid = false;
		int option;
		do {
			mygui.showMainMenu();
			option=Utils.leeEntero("Introduce una opción: ");
			switch(option) {
			case 0:
				valid=true;
				Utils.print("Has salido del programa.");
				break;
			case 1:
				controllerManagementMenu(b);
				break;
			case 2:
				controllerUsersMenu(b);
				break;
			default:
				Utils.print("Opción incorrecta");
				break;	
			}
		}while(!valid);
		
	}
	
	//CONTROLADOR DE GESTIÓN DE ELEMENTOS
	
	@Override
	public void controllerManagementMenu(Biblioteca b) {
		int option;
		boolean valid = false;
		
		do {
			mygui.showManagementMenu();
			option=Utils.leeEntero("Introduce una opción: ");
			switch(option) {
			case 0:
				valid=true;
				Utils.print("Has salido correctamente de la gestion del inventario.");
				break;
			case 1:
				myconEle.controllerAddElement(b); //LLama a la función que introduce un nuevo elemento
				break;
			case 2:
				myconEle.controllerReadElement(b); //LLama a la función que buscar un elemento
				break;
			case 3:
				myconEle.controllerUpdateElement(b); //LLama a la función que actualiza un elemento 
				break;
			case 4:
				myconEle.controllerDeleteElement(b); //LLama a la función que eliminar un elemento
				break;
			case 5:
				myconEle.controllerShowAllElements(b); //LLama a la función que muestra todos los elemento
				break;
			case 6:
				myconEle.controllerNuevoPrestamo(b); //LLama a la función de añadir un nuevo prestamo
				break;
			case 7:
				myconEle.controllerEliminarPrestamo(b); //LLama a la función que elimina un prestamo
				break;
			case 8:
				myconEle.controllershowAllPrestamos(b); //LLama a la función que muestra todos los prestamos
				break;
			default:
				Utils.print("Opción incorrecta");
				break;
			}
		}while(!valid);
		
		
	}
	
	//CONTROLADOR DE LOS USUARIOS
	
	@Override
	public void controllerUsersMenu(Biblioteca b) {
		int option;
		boolean valid = false;
		
		do {
			mygui.showUsersMenu();
			option=Utils.leeEntero("Introduce una opción: ");
			switch(option) {
			case 0:
				valid=true;
				Utils.print("Has salido correctamente de la gestion de usuarios.");
				break;
			case 1:
				myconUser.controllerAddUsers(b); //LLama a la función que añade un usuario
				break;
			case 2:
				myconUser.controllerReadUsers(b); //LLama a la función que busca un usuario
				break;
			case 3:
				myconUser.controllerUpdateUsers(b); //LLama a la función que actualiza un usuario
				break;
			case 4:
				myconUser.controllerDeleteUsers(b); //LLama a la función que elimina un usuario
				break;
			case 5:
				myconUser.controllerShowAllUsers(b); //LLama a la función que muestra todos los usuario
				break;
			default:
				Utils.print("Opción incorrecta"); 
				break;
			}
		}while(!valid);
		
	}

	



}
