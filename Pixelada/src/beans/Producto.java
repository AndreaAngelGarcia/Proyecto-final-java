package beans;

public class Producto {
	private int id_prod;
	private String nombre;
	private int precio_venta;
	private int precio_compra;
	private int cantidad;
	
	public Producto() {
		
	}
	
	public Producto(int id_prod, String nombre, int precio_venta, int precio_compra, int cantidad) {
		this.id_prod = id_prod;
		this.nombre = nombre;
		this.precio_venta = precio_venta;
		this.precio_compra = precio_compra;
		this.cantidad = cantidad;
	}
	
	//SETTERS Y GETTERS
		public void setId_prod(int id_prod) {
			this.id_prod = id_prod;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public int getPrecio_venta() {
			return precio_venta;
		}
		
		public void setPrecio_venta(int precio_venta) {
			this.precio_venta = precio_venta;
		}
		
		public int getPrecio_compra() {
			return precio_compra;
		}
		
		public void setPrecio_compra(int precio_compra) {
			this.precio_compra = precio_compra;
		}
		
		public int getCantidad() {
			return cantidad;
		}
		
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
}
