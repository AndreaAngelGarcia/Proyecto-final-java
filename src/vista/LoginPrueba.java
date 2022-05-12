package vista;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPrueba extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	private JPanel contentPane;
	private JTextField textUserName;
	private JPasswordField txtPassword;


	/**
	 * Create the frame.
	 */
	public LoginPrueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(188, 143, 143));
		contentPane.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("B:\\Usuarios\\ADA ITS 2021-2023\\PRIMER CURSO\\PROGRAMACI\u00D3N\\3T\\PROYECTO CRUD\\logo1.png"));
		lblNewLabel.setSize(200, 213);
		lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel.setLocation(new Point(27, 110));
		lblNewLabel.setMaximumSize(new Dimension(62, 27));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(342, 144, 185, 31);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textUserName = new JTextField();
		textUserName.setText("Username");
		textUserName.setBounds(10, 0, 165, 31);
		panel.add(textUserName);
		textUserName.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(342, 214, 185, 31);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.setText("password");
		txtPassword.setBounds(10, 0, 165, 31);
		panel_1.add(txtPassword);
		
		JLabel lblNewLabel_1 = new JLabel("INICIO SESI\u00D3N");
		lblNewLabel_1.setBackground(new Color(105, 105, 105));
		lblNewLabel_1.setBounds(342, 73, 135, 42);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(388, 293, 89, 23);
		contentPane.add(btnNewButton);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
