package beans;

public class Clientes {
	private int id_clientes;
	private String nombre;
	private String DNI;
	
	public Clientes() {
		
	}
	
	public Clientes(int id_clientes, String nombre, String DNI) {
		this.id_clientes = id;
		this.nombre = nombre;
		this.DNI = DNI;
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
	
	public String getDNI() {
		return nombre;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
}
