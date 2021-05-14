package helsinki;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio3x7 {

	//El ejercicio lee los números del usuario y los agrega a una lista. 
	//La lectura se detiene una vez que el usuario ingresa el número -1.
	
	
	//Amplíe la funcionalidad del programa para que luego de leer los números imprima todos los números
	//recibidos del usuario. El número utilizado para indicar la detención no debe imprimirse.
	
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}