package utilidades;

import javax.swing.JOptionPane;

public class Utilidades {

	//Metodo para limitar el acceso a un administrador
	public static void optionPanel(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "admin";
		
		String pass = "";
		
		
		//si clave no es igual a pass .....
		while (clave.equals(pass)==false){
		
			pass = JOptionPane.showInputDialog("Introduce la contraseņa de administrador");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Contraseņa Incorrecta");
				
			}
		}
		System.out.println("Contraseņa correcta. Acceso permitido");
		
		
	}

}
	
	
	
	

