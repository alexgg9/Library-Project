package controller;

import interfaces.iControllerUsers;
import interfaces.iGUIUsers;
import model.DTO.Usuario;
import modelo.Biblioteca;
import utils.Utils;
import view.UserView;

public class ControllerUsers implements iControllerUsers{
	private iGUIUsers myGuiUsers = new UserView();
	

	@Override
	public void controllerAddUsers(Biblioteca b) {
		myGuiUsers.addUser();
		String dni=Utils.devuelveDNI("Introduce el dni: ");
		String nombre=Utils.leeString("Introduce el nombre del usuario: ");
		String apellidos=Utils.leeString("Introduce los apellidos del usuario: ");
		String direccion=Utils.leeString("Introduce la direccion del usuario: ");
		int edad=Utils.leeEntero("Introduce la edad del usuario: ");
		Usuario nuevo = new Usuario(dni,nombre,apellidos,direccion,edad);
		if(b.addUser(nuevo)) {
			Utils.print("Insertado correctamente.");
		} else {
			Utils.print("El dni insertado ya existe, intente con otro dni que no este registrado en el sistema.");
		}
		
		
	}

	@Override
	public void controllerReadUsers(Biblioteca b) {
		myGuiUsers.searchUser();
		String dni=Utils.devuelveDNI("Introduce el dni:");
		b.findUser(dni);
		Utils.printObject(b.findUser(dni));
		
		
	}

	@Override
	public void controllerUpdateUsers(Biblioteca b) {
		myGuiUsers.updateUser();
		Usuario u = null;
		u = (Usuario) b.findUser(Utils.devuelveDNI("Introduce el dni del usuario: "));
		
		String nombre=Utils.leeString("Introduce el nuevo nombre del usuario: ");
		String apellidos=Utils.leeString("Introduce los apellidos del usuario: ");
		String direccion=Utils.leeString("Introduce la nueva direccion del usuario: ");
		int edad=Utils.leeEntero("Introduce la edad del usuario: ");
		
		u.setNombre(nombre);
		u.setApellidos(apellidos);
		u.setDireccion(direccion);
		u.setEdad(edad);
		
		
	}

	@Override
	public void controllerDeleteUsers(Biblioteca b) {
		myGuiUsers.deleteUser();
		b.deleteUser(b.findUser(Utils.devuelveDNI("Introduce el dni para eliminar el usuario: ")));
		
	}

	@Override
	public void controllerShowAllUsers(Biblioteca b) {
		myGuiUsers.showAllUsers();
		String usuarios = b.showAllUsers();
		Utils.print(usuarios);
		
	}

}
