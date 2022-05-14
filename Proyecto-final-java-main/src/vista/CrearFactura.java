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
		
		JLabel lblNewLabel = new JLabel("LOGO");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(480, 36, 57, 26);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("CLIENTES");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(25, 133, 135, 68);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("PRODUCTOS");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(25, 241, 135, 68);
		contentPane.add(btnNewButton_2);
		
		JButton btnFactura = new JButton("FACTURA");
		btnFactura.setBackground(new Color(105, 105, 105));
		btnFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFactura.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnFactura.setBounds(25, 356, 135, 68);
		btnFactura.setOpaque(true);
		contentPane.add(btnFactura);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(234, 98, 311, 372);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_4 = new JButton("CREAR FACTURA");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_4.setBounds(430, 486, 200, 37);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(589, 98, 388, 358);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("INTRODUCIMOS PRODUCTO");
		lblNewLabel_3.setBounds(311, 73, 189, 14);
		contentPane.add(lblNewLabel_3);
	}
}
