package view;

import interfaces.iGUI;

public class Vista implements iGUI{

	@Override
	public void showMainMenu() {
		
			System.out.println("                             	");
			System.out.println(" _______________________________ ");
			System.out.println("|                           	|");
			System.out.println("|	GESTIÓN BIBLIOTECA      |");
			System.out.println("|                           	|");
			System.out.println("| [0]-> Salir               	|");
			System.out.println("| [1]-> Gestión de inventario	|");
			System.out.println("| [2]-> Gestión de usuarios     |");
			System.out.println("|_______________________________|");
			System.out.println("                             	");

		
	}

	@Override
	public void showManagementMenu() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|     GESTIÓN INVENTARIO    |");
		System.out.println("|                           |");
		System.out.println("| [0]-> Salir               |");
		System.out.println("| [1]-> Añadir elemento     |");
		System.out.println("| [2]-> Buscar elemento     |");
		System.out.println("| [3]-> Editar elemento     |");
		System.out.println("| [4]-> Eliminar elemento   |");
		System.out.println("| [5]-> Mostrar todos       |");
		System.out.println("| [6]-> Nuevo prestamo      |");
		System.out.println("| [7]-> Eliminar prestamo   |");
		System.out.println("| [8]-> Mostrar prestamos   |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void showUsersMenu() {
		System.out.println("                             	");
		System.out.println(" _______________________________ ");
		System.out.println("|                           	|");
		System.out.println("|	    GESTIÓN USUARIOS    |");
		System.out.println("|                           	|");
		System.out.println("| [0]-> Salir                   |");
		System.out.println("| [1]-> Añadir usuario          |");
		System.out.println("| [2]-> Ver usuario         	|");
		System.out.println("| [3]-> Actualizar usuario      |");
		System.out.println("| [4]-> Eliminar usuario        |");
		System.out.println("| [5]-> Mostrar todos           |");
		System.out.println("|_______________________________|");
		System.out.println("                             	");
		
	}


	
	
	

}
