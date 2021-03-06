package vista;

import controlador.ControladorDatos;
import beans.Producto;
import beans.Cliente;
import modelo.Clientes;
import modelo.Productos;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Compra extends JFrame {

	private JPanel PanelFondo;
	
	int width = 1144;
	int height = 569;

	public Compra(Producto producto) {

		//TAMA?O PANTALLA
		setSize(1021, 562);
		
		//POSICIONAMIENTO DE LA VENTANA EN EL MEDIO DE LA PANTALLA
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();     
        this.setLocation(dim.width/2-width/2, dim.height/2-height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBackground(Color.WHITE);
		PanelFondo = new JPanel();
		PanelFondo.setBackground(new Color(128, 172, 226));
		PanelFondo.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelFondo);
		setVisible(true);
		
		// TABLA
			DefaultTableModel dtm = new DefaultTableModel();
			
			dtm.addColumn("Id_clientes");
			dtm.addColumn("Nombre");
			dtm.addColumn("DNI");
			dtm.addColumn("direccion");
			dtm.addColumn("telefono");
			dtm.addColumn("correo");
			
			ArrayList<Cliente> clientes = new ControladorDatos().refrescarClientesCompra();
			dtm.getDataVector().removeAllElements();
			dtm.fireTableDataChanged();
			
			
			// Montar los datos recogidos en la tabla
			for(Cliente cliente1 : clientes){
				Object[] fila = new Object[6];
				fila[0] = cliente1.getId_clientes();
				fila[1] = cliente1.getNombre();
				fila[2] = cliente1.getDni();					
				fila[3] = cliente1.getDireccion();
				fila[4] = cliente1.getTelefono();
				fila[5] = cliente1.getCorreo();
				
				dtm.addRow(fila);
				
			}
			setVisible(true);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(770, 188, 227, 72);
		lblNewLabel.setIcon(new ImageIcon(Productos.class.getResource("/resources/logo3.png")));
		
		JButton btnNewButton = new JButton("CLIENTES");
		btnNewButton.setBounds(10, 192, 179, 68);
		btnNewButton.setIcon(new ImageIcon(Productos.class.getResource("/resources/Clientes.png")));
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new Clientes().setVisible(true);
				//dispose();  //Cerrar pesta?a
			}
		});
		
		JButton btnNewButton_2 = new JButton("PRODUCTOS");
		btnNewButton_2.setBounds(10, 326, 179, 68);
		btnNewButton_2.setIcon(new ImageIcon(Productos.class.getResource("/resources/productos.png")));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new Productos().setVisible(true);
				dispose();  //Cerrar pesta?a
			}
		});
		
		
		JPanel panel = new JPanel();
		panel.setBounds(318, 95, 416, 271);
		panel.setBackground(new Color(153, 204, 153));
		panel.setLayout(null);
		
		
		// LABEL DE PRODUCTOS
		JLabel TextID = new JLabel(producto.getId_prod()+"");
		TextID.setFont(new Font("Times New Roman", Font.BOLD, 14));
		TextID.setBounds(200, 50, 47, 30);
		panel.add(TextID);
		
		JLabel textNombre = new JLabel(producto.getNombre());
		textNombre.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textNombre.setBounds(195, 91, 172, 30);
		panel.add(textNombre);
		
		JLabel textPrecio_venta = new JLabel(producto.getPrecio_venta()+"");
		textPrecio_venta.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textPrecio_venta.setBounds(200, 132, 68, 30);
		panel.add(textPrecio_venta);
		
		JLabel textPrecio_compra = new JLabel(producto.getPrecio_compra()+"");
		textPrecio_compra.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textPrecio_compra.setBounds(200, 173, 63, 30);
		panel.add(textPrecio_compra);
		
		JLabel textCantidad = new JLabel(producto.getCantidad()+"");
		textCantidad.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textCantidad.setBounds(200, 214, 63, 30);
		panel.add(textCantidad);
		
		setVisible(true);
		
		JLabel lblNewLabel_6 = new JLabel("PRODUCTOS");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_6.setBounds(140, 11, 156, 39);
		panel.add(lblNewLabel_6);
		PanelFondo.setLayout(null);
		PanelFondo.add(lblNewLabel);
		PanelFondo.add(btnNewButton);
		PanelFondo.add(btnNewButton_2);
		PanelFondo.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(58, 59, 26, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(44, 99, 76, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio_venta");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(31, 136, 109, 23);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Precio_compra");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(22, 181, 109, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cantidad");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(47, 222, 93, 14);
		panel.add(lblNewLabel_5);
		
		JLabel fondoAzulOscuro = new JLabel("");
		fondoAzulOscuro.setBackground(new Color(51, 102, 153));
		fondoAzulOscuro.setBounds(0, 0, 201, 532);
		fondoAzulOscuro.setOpaque(true);
		PanelFondo.add(fondoAzulOscuro);
		
		JButton btnRealizarFactura = new JButton("REALIZAR FACTURA");
		
		btnRealizarFactura.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		btnRealizarFactura.setBounds(408, 404, 227, 52);
		PanelFondo.add(btnRealizarFactura);
		
		
		/* ACCIONES */
		
		//BOTON REALIZAR FACTURA
		btnRealizarFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = (textNombre.getText());
				String precio_venta = (textPrecio_venta.getText());
				String precio_compra = (textPrecio_compra.getText());
				String cantidad = (textCantidad.getText());
				new ControladorDatos().crearFichero(nombre, precio_venta, precio_compra, cantidad);	
			}
		});
		
		
	}
}