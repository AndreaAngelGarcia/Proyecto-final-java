package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import beans.Producto;

public class Compra extends JFrame {

	private JPanel contentPane;

	public Compra(Producto producto) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel textNombre = new JLabel(producto.getNombre());
		textNombre.setBounds(107, 108, 161, 20);
		contentPane.add(textNombre);
		
		JLabel textPrecio_venta = new JLabel(producto.getPrecio_venta()+"");
		textPrecio_venta.setBounds(107, 149, 161, 20);
		contentPane.add(textPrecio_venta);
		
		JLabel textID = new JLabel(producto.getPrecio_compra()+"");
		textID.setBounds(107, 67, 161, 20);
		contentPane.add(textID);
		
		setVisible(true);
	}

}
