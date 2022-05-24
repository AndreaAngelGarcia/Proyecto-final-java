package vista;

import controlador.ControladorDatos;
import beans.Producto;

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

public class Productos extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textNombre;
	private JTextField textPrecio_venta;
	private JTextField textID;
	private JTextField textPrecio_compra;
	private JTextField textCantidad;
	
	int width = 1144;
	int height = 569;

	public Productos() {
		
		setSize(width, height);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();     //El posicionamiento de la ventana en el medio de la pantalla
        this.setLocation(dim.width/2-width/2, dim.height/2-height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		setBackground(Color.WHITE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 172, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// TABLA
		DefaultTableModel dtm = new DefaultTableModel();
		table = new JTable(dtm);
		table.setBounds(545, 142, 573, 339);		
		contentPane.add(table);
		
		dtm.addColumn("Id_prod");
		dtm.addColumn("Nombre");
		dtm.addColumn("Precio_venta");
		dtm.addColumn("Precio_compra");
		dtm.addColumn("Cantidad");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(498, 11, 227, 72);
		lblNewLabel.setIcon(new ImageIcon(Productos.class.getResource("/resources/logo3.png")));
		
		JButton btnNewButton = new JButton("CLIENTES");
		btnNewButton.setBounds(10, 144, 179, 68);
		btnNewButton.setIcon(new ImageIcon(Productos.class.getResource("/resources/Clientes.png")));
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Clientes().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		
		JButton btnNewButton_2 = new JButton("PRODUCTOS");
		btnNewButton_2.setForeground(SystemColor.textHighlightText);
		btnNewButton_2.setBounds(10, 256, 179, 68);
		btnNewButton_2.setIcon(new ImageIcon(Productos.class.getResource("/resources/productos.png")));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(105, 105, 105));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Productos().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		
		JButton btnFactura = new JButton("COMPRAR");
		btnFactura.setBounds(10, 361, 179, 68);
		btnFactura.setIcon(new ImageIcon(Productos.class.getResource("/resources/report.png")));
		btnFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto producto = crearProductoDesdeFormulario();
				new Compra(producto);
				//new CrearFactura().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		btnFactura.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnFactura.setOpaque(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(211, 115, 277, 271);
		panel.setBackground(new Color(153, 204, 153));
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(36, 61, 77, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(20, 102, 77, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio_venta");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 143, 87, 30);
		panel.add(lblNewLabel_3);
		
		textNombre = new JTextField();
		textNombre.setBounds(107, 108, 161, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		textPrecio_venta = new JTextField();
		textPrecio_venta.setBounds(107, 149, 161, 20);
		panel.add(textPrecio_venta);
		textPrecio_venta.setColumns(10);
		
		textID = new JTextField();
		textID.setBounds(107, 67, 161, 20);
		panel.add(textID);
		textID.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Precio_compra");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 184, 103, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cantidad");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(20, 225, 77, 30);
		panel.add(lblNewLabel_5);
		
		textPrecio_compra = new JTextField();
		textPrecio_compra.setBounds(106, 190, 161, 20);
		panel.add(textPrecio_compra);
		textPrecio_compra.setColumns(10);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(107, 231, 161, 20);
		panel.add(textCantidad);
		textCantidad.setColumns(10);
		
		JButton buttonCrearProducto = new JButton("CREAR");
		buttonCrearProducto.setBounds(211, 404, 128, 52);
		buttonCrearProducto.setFont(new Font("Times New Roman", Font.BOLD, 12));
		buttonCrearProducto.setIcon(new ImageIcon(Productos.class.getResource("/resources/nuevo.png")));
		
		
		JButton buttonModificarProducto = new JButton("MODIFICAR");
		buttonModificarProducto.setBounds(349, 404, 139, 52);
		buttonModificarProducto.setIcon(new ImageIcon(Productos.class.getResource("/resources/Actualizar.png")));
		buttonModificarProducto.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JButton buttonRefrescarProductos = new JButton("REFRESCAR");
		buttonRefrescarProductos.setBounds(211, 467, 128, 49);
		buttonRefrescarProductos.setIcon(new ImageIcon(Productos.class.getResource("/resources/GuardarTodo.png")));
		buttonRefrescarProductos.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JButton buttonBorrarProducto = new JButton("BORRAR");
		buttonBorrarProducto.setBounds(349, 467, 139, 49);
		buttonBorrarProducto.setFont(new Font("Times New Roman", Font.BOLD, 12));
		buttonBorrarProducto.setIcon(new ImageIcon(Productos.class.getResource("/resources/eliminar.png")));
		
		JLabel lblNewLabel_6 = new JLabel("PRODUCTOS");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_6.setBounds(87, 11, 103, 39);
		panel.add(lblNewLabel_6);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_2);
		contentPane.add(btnFactura);
		contentPane.add(buttonCrearProducto);
		contentPane.add(buttonModificarProducto);
		contentPane.add(panel);
		contentPane.add(buttonRefrescarProductos);
		contentPane.add(buttonBorrarProducto);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBackground(new Color(51, 102, 153));
		lblNewLabel_7.setBounds(0, 0, 201, 532);
		lblNewLabel_7.setOpaque(true);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("ID");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_8.setBounds(595, 114, 20, 27);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Nombre");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_9.setBounds(696, 115, 58, 25);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Precio compra");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_10.setBounds(787, 120, 116, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Precio venta");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_11.setBounds(902, 121, 103, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Cantidad");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_12.setBounds(1029, 115, 89, 27);
		contentPane.add(lblNewLabel_12);
		
		
		/* ACCIONES */
		
		buttonCrearProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Producto producto = crearProductoDesdeFormulario();
                    new ControladorDatos().crearProducto(producto);
                } catch(Exception error) {
                    JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
                    return;
                }
			}
		});
		
		buttonModificarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Producto producto = crearProductoDesdeFormulario();
                    new ControladorDatos().modificarProducto(producto);
                } catch(Exception error) {
                    JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
                    return;
                }
			}
		});
		
		buttonBorrarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id_prod = Integer.parseInt(textID.getText());
					new ControladorDatos().borrarProducto(id_prod);
					
				} catch(Exception error) {
					JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
					return;
				}
			}
		});

		buttonRefrescarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Producto> productos = new ControladorDatos().refrescartodosProductos();
				dtm.getDataVector().removeAllElements();
				dtm.fireTableDataChanged();
				
				// Montar los datos recogidos en la tabla
				for(Producto producto : productos){
					Object[] fila = new Object[5];
					fila[0] = producto.getId_prod();
					fila[1] = producto.getNombre();
					fila[2] = producto.getPrecio_venta();
					fila[3] = producto.getPrecio_compra();					
					fila[4] = producto.getCantidad();
					
					dtm.addRow(fila);
				}
			}
		});
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
	        public void valueChanged(ListSelectionEvent event) {
	        	if(table.getSelectedRow() == -1) return;
	        	int id = (int) table.getValueAt(table.getSelectedRow(), 0);
	        	String nombre = (String) table.getValueAt(table.getSelectedRow(), 1);
	        	int precioVenta = (int) table.getValueAt(table.getSelectedRow(), 2);
	        	int precioCompra = (int) table.getValueAt(table.getSelectedRow(), 3);
	        	int Cantidad = (int) table.getValueAt(table.getSelectedRow(), 4);
	        	textID.setText(id+"");
	        	textNombre.setText(nombre);
	        	textPrecio_venta.setText(precioVenta+"");
	        	textPrecio_compra.setText(precioCompra+"");
	        	textCantidad.setText(Cantidad+"");
	        }
	    });
		
		
	}

	private Producto crearProductoDesdeFormulario() {
		int id_prod = Integer.parseInt(textID.getText());
        String nombre = textNombre.getText();
        int precio_venta = Integer.parseInt(textPrecio_venta.getText());
        int precio_compra = Integer.parseInt(textPrecio_compra.getText());
        int cantidad = Integer.parseInt(textCantidad.getText());
        Producto producto = new Producto(id_prod, nombre, precio_venta, precio_compra, cantidad);
		return producto;
	}
	
	
	
	
	
	
	
}