package Main;

import controller.Controlador;
import modelo.Biblioteca;

public class Main {

	public static void main(String[] args) {
		Controlador c = new Controlador();
		Biblioteca b = new Biblioteca();
		c.controllerMainMenu(b);
		

	}

}
