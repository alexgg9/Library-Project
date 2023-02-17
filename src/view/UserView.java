package view;

import interfaces.iGUIUsers;


public class UserView implements iGUIUsers{

	@Override
	public void addUser() {
		
			System.out.println("                             ");
			System.out.println(" ___________________________ ");
			System.out.println("|                           |");
			System.out.println("|      AÑADIR USUARIO       |");
			System.out.println("|___________________________|");
			System.out.println("                             ");

		
		
	}

	@Override
	public void searchUser() {
		
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      BUSCAR USUARIO       |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
		
		
	}

	@Override
	public void updateUser() {
		
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      ACTUALIZAR USUARIO   |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void deleteUser() {
		
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      ELIMINAR USUARIO     |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}
	public void showAllUsers() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|    USUARIOS REGISTRADOS   |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
	}

}
