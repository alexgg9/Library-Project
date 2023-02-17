package view;

import interfaces.iGUIManagement;

public class ManagementView implements iGUIManagement{

	@Override
	public void addElement() {
		
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      AÑADIR ELEMENTO      |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void readElement() {
		
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      BUSCAR ELEMENTO      |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void updateElement() {
		
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|     ACTUALIZAR ELEMENTO   |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
		
	}

	@Override
	public void deleteElement() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|     ELIMINAR ELEMENTO     |");
		System.out.println("|___________________________|");
		System.out.println("                             ");		
	}

	@Override
	public void type() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|     SELECCIONA UN TIPO    |");
		System.out.println("|                           |");
		System.out.println("|  [0]-> Salir              |");
		System.out.println("|  [1]-> Ejemplar           |");
		System.out.println("|  [2]-> Revista            |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void showAllElements() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|   EJEMPLARES ALMACENADOS  |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void newPrestamo() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|       NUEVO PRESTAMO      |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void deletePrestamo() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|     ELIMINAR PRESTAMOS    |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void showAllPrestamos() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|   PRESTAMOS REGISTRADOS   |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}
	
	

}
