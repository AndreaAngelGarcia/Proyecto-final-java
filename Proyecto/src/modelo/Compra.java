package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import bbdd.Conexion;
import beans.Cliente;
import beans.Producto;

public class Compra {
	
	//REFRESCAR CLIENTES
	public ArrayList<Cliente> refrescarCompra(){
		
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
	
		
	//FICHERO
	public void crearFichero(String nombre, String precio_venta, String precio_compra, String cantidad) {
		
        FileWriter fichero = null;
        try {
            // Crear el objeto que va a escribir el fichero
            fichero = new FileWriter("factura.md");

            fichero.write("#" + " PIXELADA"+"\n\n\n\n");
            fichero.write("-------------------------" + "\n\n");
            
            fichero.write("##" + "Factura nº1"+ "\n\n");
            
            fichero.write("Nombre del cliente: Andrea Ángel García"+"\n\n");
            fichero.write("DNI cliente: 30245577D"+"\n\n");
            fichero.write("Dirección cliente: Calle Turia"+"\n\n");
            fichero.write("Teléfono cliente: +34 657448877"+"\n\n");
            fichero.write("Correo cliente: andrea.angel@adaits.es"+"\n\n");
   
            fichero.write("##" + " SUMARIO"+"\n\n\n\n");

            fichero.write("Producto              |  Cantidad  | Precio venta      | Precio compra" + "\n\n");
            fichero.write("--------------------- | -------    | ------------------| -------------"+ "\n\n");
            fichero.write(nombre         +      "|"+cantidad+"| " +precio_venta+ "|" +precio_compra+ "\n\n");

            fichero.write("##" + "Terminos" + "\n\n");

            fichero.write("+ Los pagos deben hacerse con el nombre del cliente\n\n");
            fichero.write("El total debe pagarse en un plazo maximo de 30 dias\n\n\n\n");

            
            fichero.close();

        } catch (Exception e) {
            System.out.println(e);
        }
	}
	
	public void borrarFichero() {
		File fichero = new File("factura.txt");
		
		//SALDRÁ MENSAJE POR TERMINAL
		if (fichero.delete())
			   System.out.println("El fichero ha sido borrado satisfactoriamente");
			else
			   System.out.println("El fichero no puede ser borrado");
	}

}
