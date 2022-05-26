package modelo;

import bbdd.Conexion;
import beans.Producto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Statement;

public class Productos {
	
	//CREAR PRODUCTO

	public void insertarProducto(Producto producto) {
		int id_prod = producto.getId_prod();
		String nombre = producto.getNombre();
		int precio_venta = producto.getPrecio_venta();
		int precio_compra = producto.getPrecio_compra();
		int cantidad = producto.getCantidad();

		Conexion.ejecutarUpdate("INSERT INTO PRODUCTOS (id_prod, nombre, precio_venta, precio_compra, cantidad) VALUES ('"+id_prod+"', '"+nombre+"', '"+precio_venta+"', '"+precio_compra+"', '"+cantidad+"');");
	}
	
	
	// VISUALIZAR PRODUCTOS
	
	public static ArrayList<Producto> refrescarProductos(){
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM productos;");
		
		try {
			while(resultado.next()) {
				int id_prod = resultado.getInt("id_prod");
				String nombre = resultado.getString("nombre");
				int precio_venta = resultado.getInt("precio_venta");
				int precio_compra = resultado.getInt("precio_compra");
				int cantidad = resultado.getInt("cantidad");
				productos.add(new Producto(id_prod, nombre, precio_venta, precio_compra, cantidad));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productos;
	}
	
	//BORRAR PRODUCTO	
	public void borrarProducto(int id_prod) {
		Conexion.ejecutarUpdate("DELETE FROM PRODUCTOS WHERE id_prod="+id_prod+";");
	}
	
	
	// MODIFICAR PRODUCTO
	public void modificarProducto(Producto producto) {
		int id_prod = producto.getId_prod();
		String nombre = producto.getNombre();
		int precio_venta = producto.getPrecio_venta();
		int precio_compra = producto.getPrecio_compra();
		int cantidad = producto.getCantidad();
		
		Conexion.ejecutarUpdate("UPDATE productos SET nombre='"+nombre+"', precio_venta='"+precio_venta+"', "
				+ "precio_compra='"+precio_compra+"', cantidad ='"+cantidad+"' WHERE id_prod = "+id_prod+";");
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
}
