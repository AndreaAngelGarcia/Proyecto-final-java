package controlador;

import modelo.Productos;
import beans.Producto;

public class ControladorDatos {
	
	public static void recogerProductos() {
		Productos.recogerProductos();
	}
	
	public void crearProducto(Producto producto) {
		new Productos().insertarProducto(producto);
	}
}
