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
		String precio_venta = producto.getPrecio_venta();
		String precio_compra = producto.getPrecio_compra();
		String cantidad = producto.getCantidad();

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
				String precio_venta = resultado.getString("precio_venta");
				String precio_compra = resultado.getString("precio_compra");
				String cantidad = resultado.getString("cantidad");
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
		String precio_venta = producto.getPrecio_venta();
		String precio_compra = producto.getPrecio_compra();
		String cantidad = producto.getCantidad();
		
		Conexion.ejecutarUpdate("UPDATE productos SET nombre='"+nombre+"', precio_venta='"+precio_venta+"', "
				+ "precio_compra='"+precio_compra+"', cantidad ='"+cantidad+"' WHERE id_prod = "+id_prod+";");
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
}
