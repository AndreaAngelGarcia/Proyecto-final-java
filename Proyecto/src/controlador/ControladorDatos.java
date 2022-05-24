package controlador;

import modelo.Productos;

import javax.swing.JOptionPane;

import beans.Producto;

public class ControladorDatos {
	
	//MÉTODOS PRODUCTOS
	public static void recogerProductos() {
		Productos.recogerProductos();
	}
	
	public void crearProducto(Producto producto) {
		new Productos().insertarProducto(producto);
		JOptionPane.showMessageDialog(null, "¡Has insertado correctamente el nuevo producto!");
	}
	
	public void borrarProducto(int id_prod) {
		new Productos().borrarProducto(id_prod);
		JOptionPane.showMessageDialog(null, "¡Has borrado correctamente el producto!");
	}
}
