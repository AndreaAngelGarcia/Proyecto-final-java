package beans;

public class Producto {
	private int id_prod;
	private String nombre;
	private String precio_venta;
	private String precio_compra;
	private String cantidad;
	
	public Producto(int id_prod) {
		this.id_prod = id_prod;
	}
	
	public Producto(int id_prod, String nombre, String precio_venta, String precio_compra, String cantidad) {
		this.id_prod = id_prod;
		this.nombre = nombre;
		this.precio_venta = precio_venta;
		this.precio_compra = precio_compra;
		this.cantidad = cantidad;
	}
	
	//SETTERS Y GETTERS
	
		public int getId_prod() {
			return id_prod;
		}
	
		public void setId_prod(int id_prod) {
			this.id_prod = id_prod;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getPrecio_venta() {
			return precio_venta;
		}
		
		public void setPrecio_venta(String precio_venta) {
			this.precio_venta = precio_venta;
		}
		
		public String getPrecio_compra() {
			return precio_compra;
		}
		
		public void setPrecio_compra(String precio_compra) {
			this.precio_compra = precio_compra;
		}
		
		public String getCantidad() {
			return cantidad;
		}
		
		public void setCantidad(String cantidad) {
			this.cantidad = cantidad;
		}
}