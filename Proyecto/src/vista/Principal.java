package vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

public class Principal extends JFrame {

	private JPanel contentPane;

	int width= 1120;
	int height = 575;
	
	public Principal() {
		
		setSize(width, height);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();     //El posicionamiento de la ventana en el medio de la pantalla
        this.setLocation(dim.width/2-width/2, dim.height/2-height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 172, 226));
		contentPane.setForeground(SystemColor.menuText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JButton btnClientes = new JButton("CLIENTES");
		btnClientes.setForeground(SystemColor.textHighlightText);
		btnClientes.setBackground(SystemColor.textInactiveText);
		btnClientes.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Clientes().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		btnClientes.setBounds(96, 183, 293, 107);
		contentPane.add(btnClientes);
		
		JButton btnNewButton_1 = new JButton("PRODUCTOS");
		btnNewButton_1.setForeground(SystemColor.textHighlightText);
		btnNewButton_1.setBackground(SystemColor.textInactiveText);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Productos().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(641, 183, 293, 107);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("FACTURA");
		btnNewButton_3.setForeground(SystemColor.textHighlightText);
		btnNewButton_3.setBackground(SystemColor.textInactiveText);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CrearFactura().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		btnNewButton_3.setBounds(395, 378, 255, 107);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/resources/logo3.png")));
		lblNewLabel.setBounds(405, 30, 226, 127);
		contentPane.add(lblNewLabel);
		setVisible(true);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(342, 26, 322, 92);
		contentPane.add(lblNewLabel_1);
		
	}
}
