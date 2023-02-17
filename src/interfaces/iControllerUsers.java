package interfaces;

import modelo.Biblioteca;

public interface iControllerUsers {
	void controllerAddUsers(Biblioteca b);
	void controllerReadUsers(Biblioteca b);
	void controllerUpdateUsers(Biblioteca b);
	void controllerDeleteUsers(Biblioteca b);
	void controllerShowAllUsers(Biblioteca b);
}
