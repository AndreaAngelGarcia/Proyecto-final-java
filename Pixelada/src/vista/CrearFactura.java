package vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class CrearFactura extends JFrame {

	private JPanel contentPane;
	
	int width = 1126;
	int height = 573;

	
	public CrearFactura() {
		
		setSize(width, height);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();     //El posicionamiento de la ventana en el medio de la pantalla
        this.setLocation(dim.width/2-width/2, dim.height/2-height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		contentPane = new JPanel();
		contentPane.setForeground(new Color(139, 0, 0));
		contentPane.setBackground(new Color(128, 172, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBounds(462, 11, 214, 76);
		logo.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\logo3.png"));
		logo.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(logo);
		
		JButton btnNewButton = new JButton("CLIENTES");
		btnNewButton.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\Clientes.png"));
		btnNewButton.setBounds(10, 138, 179, 68);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Clientes().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("PRODUCTOS");
		btnNewButton_2.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\productos.png"));
		btnNewButton_2.setBounds(10, 241, 179, 68);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Productos().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnFactura = new JButton("FACTURA");
		btnFactura.setForeground(new Color(255, 255, 255));
		btnFactura.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\report.png"));
		btnFactura.setBounds(10, 356, 179, 68);
		btnFactura.setBackground(new Color(105, 105, 105));
		btnFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CrearFactura().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		btnFactura.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnFactura.setOpaque(true);
		contentPane.add(btnFactura);
		
		JButton Crear_factura = new JButton("CREAR FACTURA");
		Crear_factura.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\pdf.png"));
		Crear_factura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Factura().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		Crear_factura.setBounds(483, 486, 246, 37);
		Crear_factura.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(Crear_factura);
		
		JPanel panel = new JPanel();
		panel.setBounds(213, 98, 325, 377);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INTRODUCIMOS CLIENTE");
		lblNewLabel.setBounds(72, 11, 182, 17);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(lblNewLabel);
		
		JButton boton_añadir_cliente = new JButton("");
		boton_añadir_cliente.setBackground(Color.WHITE);
		boton_añadir_cliente.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\nuevo.png"));
		boton_añadir_cliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AñadirCliente().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		boton_añadir_cliente.setBounds(258, 310, 57, 56);
		panel.add(boton_añadir_cliente);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(631, 98, 354, 377);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("INTRODUCIMOS PRODUCTO");
		lblNewLabel_3.setBounds(72, 11, 199, 17);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JButton boton_añadir_producto = new JButton("");
		boton_añadir_producto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AñadirProducto().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		boton_añadir_producto.setBackground(Color.WHITE);
		boton_añadir_producto.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\nuevo.png"));
		boton_añadir_producto.setBounds(287, 313, 57, 53);
		panel_1.add(boton_añadir_producto);
	}
}
