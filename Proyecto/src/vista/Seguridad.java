package vista;

import javax.swing.JOptionPane;

public class Seguridad {
	
	String res;
	
	public void validarUsuario (String usuarios[], String user, String pwd, int intentos) {
		boolean encontrado = false;
		
		for(int i = 0; i < usuarios.length; i++) {
			if((usuarios[i].equalsIgnoreCase(user)&& usuarios[i + 1].equals(pwd))) {
				res = "Bienvenido " + user;
				encontrado = true;
			JOptionPane.showMessageDialog(null, res, "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
			}
		}//Paramos
	
		if(encontrado == false) {
			res = " clave y/o usuario erróneos llevas " + intentos + "intentos fallidos.";
			JOptionPane.showMessageDialog(null, res, "Inicio de sesión", JOptionPane.ERROR_MESSAGE);
		}
		if(intentos > 2 ) {
			JOptionPane.showMessageDialog(null, res, "3 intentos fallidos.", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
	}
}
