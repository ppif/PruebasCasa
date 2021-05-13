
//El siguiente ejemplo demuestra la adici�n de algunas cadenas en una ArrayList
//que contiene cadenas. La suma se realiza con el m�todo list add, 
//que toma como par�metro el valor a agregar. 
//Luego imprimimos el valor en la posici�n cero. 
//Para recuperar un valor de una posici�n determinada, 
//se utiliza el m�todo de lista get, al que se le asigna el lugar de recuperaci�n como par�metro.
//Para llamar a un m�todo de lista, primero escribe el nombre de la variable que describe la lista, 
//seguido de un punto y el nombre del m�todo.



//importar ArrayList
import java.util.ArrayList;

public class CrearArrayList {

	public static void main(String[] args) {
		// Crear primera ArrayList
		
		ArrayList<String> list = new ArrayList<>();
		
		// a�adir dos valores a la ArrayList
		
		list.add("Primero");
		list.add("Segundo");
		
		//recuperar el valor de la posici�n 0 de la lista de palabras e imprimelo
		
		System.out.println(list.get(0));
		
	}

}
