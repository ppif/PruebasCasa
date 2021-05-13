
//El siguiente ejemplo demuestra la adición de algunas cadenas en una ArrayList
//que contiene cadenas. La suma se realiza con el método list add, 
//que toma como parámetro el valor a agregar. 
//Luego imprimimos el valor en la posición cero. 
//Para recuperar un valor de una posición determinada, 
//se utiliza el método de lista get, al que se le asigna el lugar de recuperación como parámetro.
//Para llamar a un método de lista, primero escribe el nombre de la variable que describe la lista, 
//seguido de un punto y el nombre del método.



//importar ArrayList
import java.util.ArrayList;

public class CrearArrayList {

	public static void main(String[] args) {
		// Crear primera ArrayList
		
		ArrayList<String> list = new ArrayList<>();
		
		// añadir dos valores a la ArrayList
		
		list.add("Primero");
		list.add("Segundo");
		
		//recuperar el valor de la posición 0 de la lista de palabras e imprimelo
		
		System.out.println(list.get(0));
		
	}

}
