package vista;

import controlador.ControladorDatos;
import beans.Cliente;
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
import javax.swing.SwingConstants;

public class Clientes extends JFrame {

	private JPanel PanelFondo;
	private JTable table;
	private JTextField textNombre;
	private JTextField textDni;
	private JTextField textID;
	private JTextField textDireccion;
	private JTextField textTelefono;
	
	int width = 1144;
	int height = 569;
	private JTextField textCorreo;

	public Clientes() {
		
		setSize(1147, 570);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();     //Posicionamiento de la ventana en el medio de la pantalla
        this.setLocation(dim.width/2-width/2, dim.height/2-height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		setBackground(Color.WHITE);
		PanelFondo = new JPanel();
		PanelFondo.setBackground(new Color(128, 172, 226));
		PanelFondo.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelFondo);
		
		// TABLA
		DefaultTableModel dtm = new DefaultTableModel();
		table = new JTable(dtm);
		table.setBounds(550, 111, 573, 339);		
		PanelFondo.add(table);
		
		dtm.addColumn("Id_clientes");
		dtm.addColumn("Nombre");
		dtm.addColumn("Dni");
		dtm.addColumn("Dirección");
		dtm.addColumn("Teléfono");
		dtm.addColumn("Correo");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(482, 0, 227, 72);
		lblNewLabel.setIcon(new ImageIcon(Productos.class.getResource("/resources/logo3.png")));
		
		JButton btnNewButton = new JButton("CLIENTES");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(10, 166, 179, 68);
		btnNewButton.setIcon(new ImageIcon(Productos.class.getResource("/resources/Clientes.png")));
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Clientes().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		
		JButton btnNewButton_2 = new JButton("PRODUCTOS");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBounds(10, 303, 179, 68);
		btnNewButton_2.setIcon(new ImageIcon(Productos.class.getResource("/resources/productos.png")));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Productos().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(228, 122, 277, 271);
		panel.setBackground(new Color(153, 204, 153));
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(33, 32, 77, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(33, 73, 77, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DNI");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(30, 114, 87, 30);
		panel.add(lblNewLabel_3);
		
		textNombre = new JTextField();
		textNombre.setBounds(107, 79, 161, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		textDni = new JTextField();
		textDni.setBounds(107, 120, 161, 20);
		panel.add(textDni);
		textDni.setColumns(10);
		
		textID = new JTextField();
		textID.setBounds(107, 38, 161, 20);
		panel.add(textID);
		textID.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Direcci\u00F3n");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(20, 155, 103, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tel\u00E9fono");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(20, 196, 77, 30);
		panel.add(lblNewLabel_5);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(107, 161, 161, 20);
		panel.add(textDireccion);
		textDireccion.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(107, 202, 161, 20);
		panel.add(textTelefono);
		textTelefono.setColumns(10);
		
		JButton buttonCrearCliente = new JButton("CREAR");
		buttonCrearCliente.setBounds(211, 404, 139, 52);
		buttonCrearCliente.setFont(new Font("Times New Roman", Font.BOLD, 12));
		buttonCrearCliente.setIcon(new ImageIcon(Productos.class.getResource("/resources/nuevo.png")));
			
		JButton buttonModificarCliente = new JButton("MODIFICAR");
		buttonModificarCliente.setBounds(377, 404, 145, 52);
		buttonModificarCliente.setIcon(new ImageIcon(Productos.class.getResource("/resources/Actualizar.png")));
		buttonModificarCliente.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JButton buttonRefrescarClientes = new JButton("REFRESCAR");
		buttonRefrescarClientes.setBounds(211, 467, 139, 49);
		buttonRefrescarClientes.setIcon(new ImageIcon(Productos.class.getResource("/resources/GuardarTodo.png")));
		buttonRefrescarClientes.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JButton buttonBorrarCliente = new JButton("BORRAR");
		buttonBorrarCliente.setBounds(377, 467, 145, 49);
		buttonBorrarCliente.setFont(new Font("Times New Roman", Font.BOLD, 12));
		buttonBorrarCliente.setIcon(new ImageIcon(Productos.class.getResource("/resources/eliminar.png")));
		
		JLabel lblClientes = new JLabel("CLIENTES");
		lblClientes.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblClientes.setBounds(93, 0, 103, 39);
		panel.add(lblClientes);
		PanelFondo.setLayout(null);
		PanelFondo.add(lblNewLabel);
		PanelFondo.add(btnNewButton);
		PanelFondo.add(btnNewButton_2);
		PanelFondo.add(buttonCrearCliente);
		PanelFondo.add(buttonModificarCliente);
		PanelFondo.add(panel);
		
		JLabel lblNewLabel_7 = new JLabel("Correo");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(20, 245, 67, 14);
		panel.add(lblNewLabel_7);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(107, 243, 161, 20);
		panel.add(textCorreo);
		textCorreo.setColumns(10);
		PanelFondo.add(buttonRefrescarClientes);
		PanelFondo.add(buttonBorrarCliente);
		
		JLabel fondoAzulOscuro = new JLabel("");
		fondoAzulOscuro.setBackground(new Color(51, 102, 153));
		fondoAzulOscuro.setBounds(0, 0, 201, 532);
		fondoAzulOscuro.setOpaque(true);
		PanelFondo.add(fondoAzulOscuro);
		
		JLabel lblNewLabel_8 = new JLabel("ID");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_8.setBounds(595, 80, 20, 27);
		PanelFondo.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Nombre");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_9.setBounds(658, 78, 58, 25);
		PanelFondo.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Direcci\u00F3n");
		lblNewLabel_10.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_10.setBounds(823, 86, 116, 14);
		PanelFondo.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("DNI");
		lblNewLabel_11.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_11.setBounds(746, 86, 103, 14);
		PanelFondo.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Telefono");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_12.setBounds(936, 78, 89, 27);
		PanelFondo.add(lblNewLabel_12);
		
		JLabel lblNewLabel_6 = new JLabel("Correo");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(1035, 80, 72, 20);
		PanelFondo.add(lblNewLabel_6);
		
		
		/* ACCIONES */
		
		buttonCrearCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Cliente cliente = crearClienteDesdeFormulario();
                    new ControladorDatos().crearCliente(cliente);
                    ArrayList<Cliente> clientes = new ControladorDatos().refrescartodosClientes();
                    
                    //Refrescar la tabla automaticamente despues de crear
					dtm.getDataVector().removeAllElements();
					dtm.fireTableDataChanged();
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
                    
                } catch(Exception error) {
                    JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
                    return;
                }
			}
		});
		
		buttonModificarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Cliente cliente = crearClienteDesdeFormulario();
                    new ControladorDatos().modificarCliente(cliente);
                    
                    ArrayList<Cliente> clientes = new ControladorDatos().refrescartodosClientes();
                    
                    //Refrescar la tabla automaticamente despues de modificar
					dtm.getDataVector().removeAllElements();
					dtm.fireTableDataChanged();
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
                } catch(Exception error) {
                    JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
                    return;
                }
			}
		});
		
		buttonBorrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id_prod = Integer.parseInt(textID.getText());
					new ControladorDatos().borrarProducto(id_prod);
					
					ArrayList<Cliente> clientes = new ControladorDatos().refrescartodosClientes();
					dtm.getDataVector().removeAllElements();
					dtm.fireTableDataChanged();
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
					
				} catch(Exception error) {
					JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
					return;
				}
			}
		});

		buttonRefrescarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Cliente> clientes = new ControladorDatos().refrescartodosClientes();
				dtm.getDataVector().removeAllElements();
				dtm.fireTableDataChanged();
				
				// Montar los datos recogidos en la tabla
				for(Cliente cliente : clientes){
					Object[] fila = new Object[6];
					fila[0] = cliente.getId_clientes();
					fila[1] = cliente.getNombre();
					fila[2] = cliente.getDni();
					fila[3] = cliente.getDireccion();
					fila[4] = cliente.getTelefono();
					fila[5] = cliente.getCorreo();
					
					dtm.addRow(fila);
				}
			}
		});
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
	        public void valueChanged(ListSelectionEvent event) {
	        	if(table.getSelectedRow() == -1) return;
	        	int id_clientes = (int) table.getValueAt(table.getSelectedRow(), 0);
	        	String nombre = (String) table.getValueAt(table.getSelectedRow(), 1);
	        	String dni = (String) table.getValueAt(table.getSelectedRow(), 2);
	        	String direccion = (String) table.getValueAt(table.getSelectedRow(), 3);
	        	int telefono = (int) table.getValueAt(table.getSelectedRow(), 4);
	        	String correo = (String) table.getValueAt(table.getSelectedRow(), 5);
	        	textID.setText(id_clientes+"");
	        	textNombre.setText(nombre);
	        	textDni.setText(dni);
	        	textDireccion.setText(direccion);
	        	textTelefono.setText(telefono+"");
	        	textCorreo.setText(correo);
	        }
	    });
		
		
	}

	private Cliente crearClienteDesdeFormulario() {
		int id_clientes = Integer.parseInt(textID.getText());
        String nombre = textNombre.getText();
        String dni = textDni.getText();
        String direccion = textDireccion.getText();
        int telefono = Integer.parseInt(textTelefono.getText());
        String correo = textDireccion.getText();
        Cliente cliente = new Cliente(id_clientes, nombre, dni, direccion, telefono, correo);
		return cliente;
	}
}
