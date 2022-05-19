package vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Clientes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	int width = 1144;
	int height = 569;
	private JTable table;

	public Clientes() {
		setSize(width, height);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();     //El posicionamiento de la ventana en el medio de la pantalla
        this.setLocation(dim.width/2-width/2, dim.height/2-height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		setBackground(Color.WHITE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 172, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Clientes.class.getResource("/resources/logo3.png")));
		
		JButton btnNewButton = new JButton("CLIENTES");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\Clientes.png"));
		btnNewButton.setBackground(new Color(105, 105, 105));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Clientes().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		
		JButton btnNewButton_2 = new JButton("PRODUCTOS");
		btnNewButton_2.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\productos.png"));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Productos().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		
		JButton btnFactura = new JButton("FACTURA");
		btnFactura.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\report.png"));
		btnFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CrearFactura().setVisible(true);
				dispose();  //Cerrar pestaña
			}
		});
		btnFactura.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnFactura.setOpaque(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("DNI/NIF");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 61, 77, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(20, 102, 77, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(20, 143, 77, 30);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(93, 108, 161, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(93, 149, 161, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(93, 67, 161, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tel\u00E9fono");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(20, 184, 77, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Correo");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(20, 225, 77, 30);
		panel.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(93, 184, 161, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(93, 231, 161, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("CREAR");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setIcon(new ImageIcon(Clientes.class.getResource("/resources/nuevo.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_3 = new JButton("MODIFICAR");
		btnNewButton_3.setIcon(new ImageIcon(Clientes.class.getResource("/resources/Actualizar.png")));
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JButton btnNewButton_4 = new JButton("GUARDAR");
		btnNewButton_4.setIcon(new ImageIcon(Clientes.class.getResource("/resources/GuardarTodo.png")));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JButton btnNewButton_5 = new JButton("BORRAR");
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(Clientes.class.getResource("/resources/eliminar.png")));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(new Color(230, 230, 250));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(421)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnFactura, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 615, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(198)
							.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(29)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addGap(37)
							.addComponent(btnFactura, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))))))
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(46))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"DNI/NIF", "Nombre", "Direcci\u00F3n", "Tel\u00E9fono", "Correo"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(112);
		table.getColumnModel().getColumn(4).setPreferredWidth(144);
		scrollPane_1.setViewportView(table);
		
		JLabel lblNewLabel_6 = new JLabel("CLIENTES");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_6.setBounds(102, 11, 93, 39);
		panel.add(lblNewLabel_6);
		contentPane.setLayout(gl_contentPane);
	}
}
