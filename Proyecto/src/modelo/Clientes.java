package modelo;

import bbdd.Conexion;
import beans.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Clientes {
	
	//CREAR PRODUCTO

	public void crearCliente(Cliente cliente) {		
		int id_clientes = cliente.getId_clientes();;
		String nombre = cliente.getNombre();;
		String dni = cliente.getDni();;
		String direccion = cliente.getDireccion();;
		int telefono = cliente.getTelefono();;
		String correo = cliente.getCorreo();;
			
		
		Conexion.ejecutarUpdate("INSERT INTO PRODUCTOS VALUES ('"+id_clientes+"', '"+nombre+"',"
				+ " '"+dni+"', '"+direccion+", '"+telefono+"', '"+correo+"');");	
	}
	
	// VISUALIZAR PRODUCTOS
	
	public ArrayList<Cliente> recogerClientes(){
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
	
	//BORRAR PRODUCTO	
	public void borrarCliente(int id_prod) {
		Conexion.ejecutarUpdate("DELETE FROM PRODUCTOS WHERE id="+id_prod+";");
	}
	
	
	// MODIFICAR PRODUCTO
	public void modificarCliente(Cliente cliente) {
		int id_prod = cliente.getId_prod();
		String nombre = cliente.getNombre();
		String precio_venta = cliente.getPrecio_venta();
		String precio_compra = cliente.getPrecio_compra();
		int telefono = cliente.getTelefono();
		String cantidad = cliente.getCantidad();
		
		Conexion.ejecutarUpdate("UPDATE productos SET nombre='"+nombre+"', precio_venta='"+precio_venta+"', "
				+ "precio_compra='"+precio_compra+"', cantidad ='"+cantidad+"' WHERE id_prod = "+id_prod+";");
		
	}
	
	
	
	
	
	
	
	
	
}