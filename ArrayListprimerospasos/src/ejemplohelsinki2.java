import java.util.ArrayList;

public class ejemplohelsinki2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> teachers = new ArrayList<>();

		teachers.add("Simon");
		teachers.add("Samuel");
		teachers.add("Ann");
		teachers.add("Anna");

		int index = 0;
		
		// Repeat for as long as the value of the variable `index`
		// is smaller than the size of the teachers list
		
		while (index < teachers.size()) {
		    System.out.println(teachers.get(index));
		    index = index + 1;
		}
		
		//Ahora la impresión funciona independientemente del número de elementos.
		//El bucle for que inspeccionamos anteriormente utilizado para iterar sobre un número conocido de elementos es extremadamente útil aquí. Podemos convertir el bucle anterior en un forbucle, después de lo cual el programa se ve así.

		ArrayList<String> teachers1 = new ArrayList<>();

		teachers1.add("Simon");
		teachers1.add("Samuel");
		teachers1.add("Ann");
		teachers1.add("Anna");

		for (int index1 = 0; index1 < teachers1.size(); index1++) {
		    System.out.println(teachers1.get(index1));
		}
		
	}

	
}
