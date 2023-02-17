package interfaces;

import modelo.Biblioteca;

public interface iControllerElementos {
	void controllerAddElement(Biblioteca b);
	void controllerReadElement(Biblioteca b);
	void controllerUpdateElement(Biblioteca b);
	void controllerDeleteElement(Biblioteca b);
	void controllerNuevoPrestamo(Biblioteca b);
	void controllerEliminarPrestamo(Biblioteca b);
	void controllershowAllPrestamos(Biblioteca b);
	void addCopyBook(Biblioteca b);
	void addMagazine(Biblioteca b);
	void updateCopyBook(Biblioteca b);
	void updateMagazine(Biblioteca b);
	void controllerShowAllElements(Biblioteca b);
}
