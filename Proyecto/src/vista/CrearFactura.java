package vista;

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

	
	public CrearFactura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1126, 573);
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
		btnNewButton.setBounds(25, 133, 135, 68);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("PRODUCTOS");
		btnNewButton_2.setBounds(25, 241, 135, 68);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnFactura = new JButton("FACTURA");
		btnFactura.setBounds(25, 356, 135, 68);
		btnFactura.setBackground(new Color(105, 105, 105));
		btnFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFactura.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnFactura.setOpaque(true);
		contentPane.add(btnFactura);
		
		JButton Crear_factura = new JButton("CREAR FACTURA");
		Crear_factura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Factura().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		Crear_factura.setBounds(483, 486, 200, 37);
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
		boton_añadir_cliente.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\a\u00F1adir2.png"));
		boton_añadir_cliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AñadirCliente().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		boton_añadir_cliente.setBounds(243, 295, 72, 71);
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
		boton_añadir_producto.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\a\u00F1adir2.png"));
		boton_añadir_producto.setBounds(273, 293, 71, 73);
		panel_1.add(boton_añadir_producto);
	}
}
