package controler;
import java.util.Scanner;

public class LoginControler {
	
	//pedir al usuario nombre y contrase�a
	//con sus mensajes por pantalla
	
	
	//test first commit
	//commit 1
	
	public static void login() {
		Scanner scanner = new Scanner(System.in);
		String usuario = "";
		String password = "";
	
		
		System.out.print("Por favor, escribe su nombre de usuario\n");
		usuario = scanner.nextLine();
		
		System.out.print("Por favor, escribe contrase�a\n");
		password = scanner.nextLine();
		
		
		//compare with array of users
		
		if (ControlerPrincipal.checkIfUserExist(usuario) &&
				ControlerPrincipal.getUserFromList(usuario).getPassword().equals(password)) {
			System.out.println("Bienvenido " + usuario);
			//return a�adir metodo que te lleva a ControlerUsuario;
			ControlerGastos.MenuPrincipalGestionGastos(usuario);
		} else {
			System.out.println("Your password or login is not correct. Try again please");
			//return "0";
		}
		
	}
	
}