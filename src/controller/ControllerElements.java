package controller;

import java.time.LocalDate;

import interfaces.iControllerElementos;
import interfaces.iGUIManagement;
import model.DTO.Ejemplar;
import model.DTO.Elemento;
import model.DTO.Revista;
import model.DTO.Usuario;
import modelo.Biblioteca;
import utils.Utils;
import view.ManagementView;

public class ControllerElements implements iControllerElementos{
	private iGUIManagement myGuiManag = new ManagementView();
	

	@Override
	public void controllerAddElement(Biblioteca  b) {
		int option;
		boolean valid = false;
	
		do {
			myGuiManag.type();
			option=Utils.leeEntero("Elije el tipo de elemento: ");
			switch(option) {
				case 0:
					valid=true;
					Utils.print("Has salido correctamente de la seleccion de elemento.");
					break;
				case 1:
					addCopyBook(b);
					break;
				case 2:
					addMagazine(b);
					break;
				default:
					Utils.print("Opción incorrecta");
					break;
			}
		}while(!valid);
		

		
	}
	
	

	
	public void addCopyBook(Biblioteca b) {
		
		int cod=Utils.leeEntero("Introduce el código del ejemplar: ");
		String titulo=Utils.leeString("Introduce el título del ejemplar: ");
		int anoPublic=Utils.leeEntero("Introduce el ano de publicacion: ");
		int ISBN=Utils.leeEntero("Introduce el ISBN de el ejemplar: ");
		int numEstanteria=Utils.leeEntero("Introduce el número de la estanteria: ");
		boolean prestado=false;
		LocalDate fechaPrestamo=null;
		Elemento nEjem = new Ejemplar(cod,titulo,anoPublic,ISBN,prestado,fechaPrestamo,numEstanteria);
		if(b.addElement(nEjem)==true){
			Utils.print("El ejemplar se ha introducido correctamente.");
		}else {
			Utils.print("No se ha registrado el ejemplar porque ya existe un elemento con el mismo código.");
		}
	}
	
	public void addMagazine(Biblioteca b) {
		
		int cod=Utils.leeEntero("Introduce el código de la revista: ");
		String titulo=Utils.leeString("Introduce el título de la revista: ");
		int numEdicion=Utils.leeEntero("Introduce el número de la edicion de la revista:");
		Elemento nRev= new Revista(cod,titulo,numEdicion);
		if(b.addElement(nRev)==true) {
			Utils.print("La revista se ha introducido correctamente.");
		}else {
			Utils.print("No se ha registrado la revista porque ya existe un elemento con el mismo código.");
		}
	}

	@Override
	public void controllerReadElement(Biblioteca b) {
		myGuiManag.readElement();
		int cod=Utils.leeEntero("Introduce el código del elemento: ");
		b.findElement(cod);
		Utils.printObject(b.findElement(cod));
			
		
	}

	@Override
	public void controllerUpdateElement(Biblioteca b) {
		myGuiManag.updateElement();
		
		if(b.isMagazine()==true) {
			updateMagazine(b);
			
		}else {  
			updateCopyBook(b);
		}
		
	}

	@Override
	public void controllerDeleteElement(Biblioteca b) {
		myGuiManag.deleteElement();
		b.deleteElement(b.findElement(Utils.leeEntero("Introduce el código para eliminar el elemento: ")));
		
	}




	@Override
	public void updateCopyBook(Biblioteca b) {
		
		Ejemplar e=null;
		e = (Ejemplar) b.findElement(Utils.leeEntero("Introduce el código del elemento: "));
		
		String titulo=Utils.leeString("Introduce el nuevo título del ejemplar: ");
		int anoPublic=Utils.leeEntero("Introduce la nueva fecha de publicación: ");
		int numEstanteria=Utils.leeEntero("Introduce el nuevo número de la estanteria: ");
		
		e.setTitulo(titulo);
		e.setAnoPublic(anoPublic);
		e.setNumEstanteria(numEstanteria);
		
	}




	@Override
	public void updateMagazine(Biblioteca b) {
		
		Revista r=null;
		r = (Revista) b.findElement(Utils.leeEntero("Introduce el codigo del elemento: "));
		String tituloR=Utils.leeString("Introduce el titulo de la revista: ");
		int numEdicion=Utils.leeEntero("Introduce el numero de la edicion de la revista:");
		
		
		r.setTitulo(tituloR);
		r.setNumEdicion(numEdicion);
		
	}




	@Override
	public void controllerShowAllElements(Biblioteca b) {
		myGuiManag.showAllElements();
		String ejemplares = b.showAllElements();
		Utils.print(ejemplares);
		
	}




	@Override
	public void controllerNuevoPrestamo(Biblioteca b) {
		myGuiManag.newPrestamo();
		Ejemplar e=null;
		e = (Ejemplar) b.findElement(Utils.leeEntero("Introduce el código del elemento que desea alquilar: "));
		Usuario u = null;
		u = (Usuario) b.findUser(Utils.leeString("Introduce tu dni para adquirir el ejemplar: "));
		if(b.prestoEjemplar(e, u)==true) {
			Utils.print("El prestamo se realizado correctamente.");
		}else {
			Utils.print("No se ha realizado el prestamo, intentelo de nuevo.");
		}
		
		
	}




	@Override
	public void controllerEliminarPrestamo(Biblioteca b) {
		myGuiManag.deleteElement();
		Ejemplar e=null;
		e = (Ejemplar) b.findElement(Utils.leeEntero("Introduce el código del ejemplar prestado: "));
		Usuario u = null;
		u = (Usuario) b.findUser(Utils.devuelveDNI("Introduce el dni del usuario que tenga prestado el ejemplar: "));
		if(b.entregaEjemplar(e, u)==true) {
			Utils.print("El prestamo se ha eliminado correctamente.");
		}else {
			Utils.print("No se ha eliminado el prestamo intentelo de nuevo.");
		}
		
		
	}


	

	@Override
	public void controllershowAllPrestamos(Biblioteca b) {
		myGuiManag.showAllPrestamos();
		String prestamos = b.showAllPrestamos();
		Utils.print(prestamos);
		

	}
	
}
