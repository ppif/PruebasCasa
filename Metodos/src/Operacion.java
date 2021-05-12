

import javax.swing.JOptionPane;


public class Operacion {

	//Creamos un programa que lea numeros y haga operaciones.
	//Atributos
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	//Metodos

	//Metodo 1 para pedir al usuario dos numeros.Sera void al no retornar
	public void leerNumeros() {
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		
	}
	
	
	//Metodo para sumar los dos numeros
		
	public void sumar () {
		
		suma = numero1+numero2;
		
	} 
	
	//Metodo para restar los dos numeros
	
	public void restar () {
		
		resta = numero1-numero2;
		
	} 
	
	//Metodo para multiplicar los dos numeros
	
	public void multiplicar () {
		
		multiplicacion = numero1*numero2;
		
	} 
	
	//Metodo para dividir los dos numeros
	
	public void dividir () {
		
		suma = numero1/numero2;
		
	} 
	
	//Metodo para mostrar los resultados
	
	public void mostrarResultados() {
		
		System.out.println("La suma es:" +suma);
		System.out.println("La resta es:" +resta);
		System.out.println("La multiplicacion es:" +multiplicacion);
		System.out.println("La division es:" +division);
	
	}
	
	
}
