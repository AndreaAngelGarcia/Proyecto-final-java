package vista;

import java.util.Scanner;
import java.util.logging.Logger;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private static Scanner sc;
	private static int intentos;
	private static String user, pwd;
	
	int width= 592;
	int height = 357;
	
	public Login() {
		
		setSize(width, height);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();     //El posicionamiento de la ventana en el medio de la pantalla
        this.setLocation(dim.width/2-width/2, dim.height/2-height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 364, 327);
		panel.setBackground(new Color(128, 172, 226));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(41, 11, 272, 305);
		panel.add(panel_1);
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\logo3.png"));
		lblNewLabel_1.setBounds(28, 11, 217, 57);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(119, 103, 143, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 166, 143, 29);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("USUARIO");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(28, 98, 66, 37);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 161, 114, 37);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("INICIA SESI\u00D3N");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FileReader fr = null;
			
				try {
					int nLineas = 0;
					int i = 0;
					String [] usuarios = null;
					String linea;
					
					sc = new Scanner(new File("B:\\Nueva carpeta\\Proyecto-App-java\\usuarios.txt"));
					File f = new File("B:/usuarios.text");
					FileReader fr = FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					
					try {
						
						while((linea=br.readLine())!=null) {
							nLineas++;
						}   }catch (ioException ex) {
							Logger.getLogger(frmLogin.class.getName().log(level.SEVERE, null, ex));
						}
					usuarios = new String[nLineas]; //tamaño del array
					
					while(sc.hasNextLine()) {
						usuarios[i++] = sc.nextLine(); //almacenamos cada linea en una posicion
					}
					
					intentos++;
					
					user = txt
					
					
				
				}catch (FileNotFoundException ex ) {
					
			}
			
			});
		
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(50, 248, 165, 46);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(364, 0, 222, 320);
		lblNewLabel.setIcon(new ImageIcon("B:\\Nueva carpeta\\Proyecto-App-java\\camara.png"));
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel);
		
	}
}
