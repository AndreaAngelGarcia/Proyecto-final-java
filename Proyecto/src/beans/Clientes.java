package beans;

public class Clientes {
	private int id_clientes;
	private String nombre;
	private String dni;
	
	public Clientes() {
		
	}
	
	public Clientes(int id_clientes, String nombre, String dni) {
		this.id_clientes = id_clientes;
		this.nombre = nombre;
		this.dni = dni;
	}
		
	//SETTERS Y GETTERS
	public void setId_clientes(int id_clientes) {
		this.id_clientes = id_clientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
