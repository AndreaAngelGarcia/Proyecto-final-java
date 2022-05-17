package beans;

import java.util.Date;

public class Factura {
	private int id_factura;
	private int cantidad;
	private Date fecha;
	private int id_clientes;
	private int id_prod;
	
	public Factura() {
		
	}
	
	public Factura(int id_factura, int cantidad, Date fecha, int id_clientes, int id_prod) {
		this.id_factura = id_factura;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.id_clientes = id_clientes;
		this.id_prod = id_prod;
	}
	
	//GETTERS Y SETTERS
	
	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public int getId_clientes() {
		return id_clientes;
	}
	
	public void setId_clientes(int id_clientes) {
		this.id_clientes = id_clientes;
	}
	
	public int getId_productos() {
		return id_prod;
	}
	
	public void setId_prod(int id_prod) {
		this.id_prod = id_prod;
	}
}
