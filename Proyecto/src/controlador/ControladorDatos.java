package controlador;

import modelo.Productos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import beans.Producto;

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
}
