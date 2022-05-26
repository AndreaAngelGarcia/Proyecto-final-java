package controlador;

import modelo.Clientes;
import modelo.Productos;
import modelo.Compra;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import beans.Producto;
import beans.Cliente;

public class ControladorDatos {
	
	//MÉTODOS PRODUCTOS
	public ArrayList<Producto> refrescartodosProductos() {
		ArrayList<Producto> productos = new Productos().refrescarProductos();
		return productos;
	}
	
	public void crearProducto(Producto producto) {
		new Productos().insertarProducto(producto);
		JOptionPane.showMessageDialog(null, "¡Has insertado correctamente el nuevo producto!");
	}
	
	public void borrarProducto(int id_prod) {
		new Productos().borrarProducto(id_prod);
		JOptionPane.showMessageDialog(null, "¡Has borrado correctamente el producto!");
	}

	public void modificarProducto(Producto producto) {
		new Productos().modificarProducto(producto);
		JOptionPane.showMessageDialog(null, "¡Has modificado correctamente el nuevo producto!");
		
	}
	
	//MÉTODOS CLIENTES
	public ArrayList<Cliente> refrescartodosClientes() {
		ArrayList<Cliente> clientes = new Clientes().refrescarClientes();
		return clientes;
	}
	
	public void crearCliente(Cliente cliente) {
		new Clientes().insertarCliente(cliente);
		JOptionPane.showMessageDialog(null, "¡Has insertado correctamente el nuevo cliente!");
	}
	
	public void borrarCliente(int id_clientes) {
		new Clientes().borrarCliente(id_clientes);
		JOptionPane.showMessageDialog(null, "¡Has borrado correctamente al cliente!");
	}

	public void modificarCliente(Cliente cliente) {
		new Clientes().modificarCliente(cliente);
		JOptionPane.showMessageDialog(null, "¡Has modificado correctamente al cliente!");
		
	}
	
	//MÉTODOS COMPRA
	public ArrayList<Cliente> refrescarClientesCompra() {
		ArrayList<Cliente> clientes = new Compra().refrescarCompra();
		return clientes;
	}
	
	public void recogerDatos() {
		/*new Compra().recogerDatos();*/
	}
	
	public void crearFichero (String nombre, String precio_venta, String precio_compra, String cantidad) {
		new Compra().crearFichero(nombre, precio_venta, precio_compra, cantidad);
		JOptionPane.showMessageDialog(null, "¡Se ha creado el fichero correctamente!");
	}
	
	public void borrarFichero () {
		new Compra().borrarFichero();
	}
	
	public void escribirFichero () {
		new Compra().escribirFichero();
	}
	
	public void leerFichero () {
		new Compra().leerFichero();
	}
	
}
