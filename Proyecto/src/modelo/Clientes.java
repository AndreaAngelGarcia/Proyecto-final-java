package modelo;

import bbdd.Conexion;
import beans.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Clientes {
	
	//CREAR CLIENTE

	public void insertarCliente(Cliente cliente) {		
		int id_clientes = cliente.getId_clientes();;
		String nombre = cliente.getNombre();;
		String dni = cliente.getDni();;
		String direccion = cliente.getDireccion();;
		int telefono = cliente.getTelefono();;
		String correo = cliente.getCorreo();;
			
		
		Conexion.ejecutarUpdate("INSERT INTO CLIENTES VALUES ('"+id_clientes+"', '"+nombre+"', '"+dni+"', '"+direccion+"', '"+telefono+"', '"+correo+"');");	
	}
	
	// VISUALIZAR CLIENTES
	
	public ArrayList<Cliente> refrescarClientes(){
		// TODO: Hacer la peticion a BBDD para recoger los alumnos
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM CLIENTES;");
		
		try {
			while(resultado.next()) {
				int id_clientes = resultado.getInt("id_clientes");
				String nombre = resultado.getString("nombre");
				String dni = resultado.getString("dni");
				String direccion = resultado.getString("direccion");
				int telefono = resultado.getInt("telefono");
				String correo = resultado.getString("correo");
				clientes.add(new Cliente(id_clientes, nombre, dni, direccion, telefono, correo));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}
	
	//BORRAR CLIENTE
	public void borrarCliente(int id_clientes) {
		Conexion.ejecutarUpdate("DELETE FROM CLIENTES WHERE id_clientes="+id_clientes+";");
	}
	
	
	// MODIFICAR CLIENTE
	public void modificarCliente(Cliente cliente) {
		int id_clientes = cliente.getId_clientes();
		String nombre = cliente.getNombre();
		String dni = cliente.getDni();
		String direccion = cliente.getDireccion();
		int telefono = cliente.getTelefono();
		String correo = cliente.getCorreo();
		
		Conexion.ejecutarUpdate("UPDATE CLIENTES SET nombre='"+nombre+"', dni='"+dni+"', direccion='"+direccion+"', telefono ='"+telefono+"', correo ='"+correo+"' WHERE id_clientes = "+id_clientes+";");
		
	}
	
	
	
	
	
	
	
	
	
}