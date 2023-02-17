package model.DTO;


public class Usuario {
	private String dni;
	private String nombre;
	private String apellidos;
	private String direccion;
	private int edad;
	
	
	public Usuario() {
		this.dni="";
		this.nombre="";
		this.apellidos="";
		this.direccion="";
		this.edad=-1;
	}
	public Usuario(String dni, String nombre, String apellidos, String direccion, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		
		return 	"\n         "+
				"\nUSUARIO "+
				"\nDni: "+ dni + 
				"\nNombre: " + nombre + 
				"\nApellidos: " + apellidos + 
				"\nDireccion: " + direccion + 
				"\nEdad: " + edad;
	}
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		
		if(obj==this) { //comparando el objeto recibido con la instancia(this), si la zona de memoria es la misma da true
			result = true;
		} else {
			if(obj!=null && obj.getClass()==this.getClass()) {
				Usuario e = (Usuario)obj;
				if(this.dni.equals(e.getDni())) {
					result=true;
				}
			}
		}
		
		return result;
	}
	
	
	
}
