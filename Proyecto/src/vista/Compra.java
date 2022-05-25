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
	private JTable table;
	
	int width = 1144;
	int height = 569;

	public Compra(Producto producto) {

		setSize(1147, 570);
		/*Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();     //Posicionamiento de la ventana en el medio de la pantalla
        this.setLocation(dim.width/2-width/2, dim.height/2-height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/ 
		
		setBackground(Color.WHITE);
		PanelFondo = new JPanel();
		PanelFondo.setBackground(new Color(128, 172, 226));
		PanelFondo.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelFondo);
		setVisible(true);
		
		// TABLA
			DefaultTableModel dtm = new DefaultTableModel();
			table = new JTable(dtm);
			table.setBounds(545, 142, 573, 246);		
			PanelFondo.add(table);
			
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
		lblNewLabel.setBounds(498, 11, 227, 72);
		lblNewLabel.setIcon(new ImageIcon(Productos.class.getResource("/resources/logo3.png")));
		
		JButton btnNewButton = new JButton("CLIENTES");
		btnNewButton.setBounds(10, 144, 179, 68);
		btnNewButton.setIcon(new ImageIcon(Productos.class.getResource("/resources/Clientes.png")));
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Clientes();
				//dispose();  //Cerrar pestaña
			}
		});
		
		JButton btnNewButton_2 = new JButton("PRODUCTOS");
		btnNewButton_2.setBounds(10, 256, 179, 68);
		btnNewButton_2.setIcon(new ImageIcon(Productos.class.getResource("/resources/productos.png")));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Productos();
				//dispose();  //Cerrar pestaña
			}
		});
		
		JButton btnFactura = new JButton("COMPRAR");
		btnFactura.setForeground(Color.WHITE);
		btnFactura.setBounds(10, 361, 179, 68);
		btnFactura.setIcon(new ImageIcon(Productos.class.getResource("/resources/report.png")));
		btnFactura.setBackground(new Color(105, 105, 105));
		btnFactura.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Producto producto = crearProductoDesdeFormulario();
				//new Compra(producto);
				dispose();  //Cerrar pestaña
			}
		});
		btnFactura.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnFactura.setOpaque(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(228, 122, 277, 271);
		panel.setBackground(new Color(153, 204, 153));
		panel.setLayout(null);
		
		
		// LABEL DE PRODUCTOS
		JLabel TextID = new JLabel(producto.getId_prod()+"");
		TextID.setFont(new Font("Times New Roman", Font.BOLD, 14));
		TextID.setBounds(164, 50, 47, 30);
		panel.add(TextID);
		
		JLabel textNombre = new JLabel(producto.getNombre());
		textNombre.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textNombre.setBounds(136, 91, 172, 30);
		panel.add(textNombre);
		
		JLabel textPrecio_venta = new JLabel(producto.getPrecio_venta()+"");
		textPrecio_venta.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textPrecio_venta.setBounds(159, 132, 68, 30);
		panel.add(textPrecio_venta);
		
		JLabel textPrecio_compra = new JLabel(producto.getPrecio_compra()+"");
		textPrecio_compra.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textPrecio_compra.setBounds(164, 173, 63, 30);
		panel.add(textPrecio_compra);
		
		JLabel textCantidad = new JLabel(producto.getCantidad()+"");
		textCantidad.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textCantidad.setBounds(164, 214, 63, 30);
		panel.add(textCantidad);
		
		setVisible(true);
		
		JButton buttonCrearProducto = new JButton("A\u00D1ADIR CLIENTE");
		buttonCrearProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonCrearProducto.setBounds(665, 440, 238, 52);
		buttonCrearProducto.setFont(new Font("Times New Roman", Font.BOLD, 12));
		buttonCrearProducto.setIcon(new ImageIcon(Productos.class.getResource("/resources/nuevo.png")));
		
		JLabel lblNewLabel_6 = new JLabel("PRODUCTOS");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_6.setBounds(87, 11, 103, 39);
		panel.add(lblNewLabel_6);
		PanelFondo.setLayout(null);
		PanelFondo.add(lblNewLabel);
		PanelFondo.add(btnNewButton);
		PanelFondo.add(btnNewButton_2);
		PanelFondo.add(btnFactura);
		PanelFondo.add(buttonCrearProducto);
		PanelFondo.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(31, 59, 26, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 100, 76, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio_venta");
		lblNewLabel_3.setBounds(10, 141, 76, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Precio_compra");
		lblNewLabel_4.setBounds(10, 182, 76, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cantidad");
		lblNewLabel_5.setBounds(10, 223, 47, 14);
		panel.add(lblNewLabel_5);
		
		JLabel fondoAzulOscuro = new JLabel("");
		fondoAzulOscuro.setBackground(new Color(51, 102, 153));
		fondoAzulOscuro.setBounds(0, 0, 201, 532);
		fondoAzulOscuro.setOpaque(true);
		PanelFondo.add(fondoAzulOscuro);
		
		JLabel lblNewLabel_8 = new JLabel("ID");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_8.setBounds(595, 114, 20, 27);
		PanelFondo.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Nombre");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_9.setBounds(696, 115, 58, 25);
		PanelFondo.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Precio compra");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_10.setBounds(787, 120, 116, 14);
		PanelFondo.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Precio venta");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_11.setBounds(902, 121, 103, 14);
		PanelFondo.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Cantidad");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_12.setBounds(1029, 115, 89, 27);
		PanelFondo.add(lblNewLabel_12);
		
		JButton btnNewButton_1 = new JButton("COMPRAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setBounds(931, 482, 122, 40);
		PanelFondo.add(btnNewButton_1);
		
		
		/* ACCIONES */
		
		
	}
	
}