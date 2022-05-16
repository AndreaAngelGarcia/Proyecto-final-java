package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Principal extends JFrame {

	private JPanel contentPane;

	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1120, 575);
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
			}
		});
		btnClientes.setBounds(117, 166, 293, 107);
		contentPane.add(btnClientes);
		
		JButton btnNewButton_1 = new JButton("PRODUCTOS");
		btnNewButton_1.setForeground(SystemColor.textHighlightText);
		btnNewButton_1.setBackground(SystemColor.textInactiveText);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(608, 166, 293, 107);
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
		btnNewButton_3.setBounds(395, 329, 255, 107);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\logo2.png"));
		lblNewLabel.setBounds(352, 37, 334, 92);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(342, 26, 322, 92);
		contentPane.add(lblNewLabel_1);
	}
}
