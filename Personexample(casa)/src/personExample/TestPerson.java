package personExample;

import java.util.ArrayList;

public class TestPerson {
	
	// ----- Start ----
	//it is function is not execute all the designed methods
	//test them etc...
	//that is, to start the program and define
	//the tempo, the sequencing of executing
    
	private static Pants p1;
	private static Pants p2;
	private static Pants p3;

	public static void executePerson() {
		
		createAndTestObjectsPerson();
		//setAndGetTestObjectsPerson();
		//testMethodsobjectsPerson();
		//testListObjectsPerson();
		//crearCalculoTalla();
		
	
	}
	
	private static void crearCalculoTalla() {
		// TODO Auto-generated method stub
		
	}

	// creation 3 objects pants
	public static void createAndTestObjectsPants() {
		
	  setP1(new Pants("Levis", "red", 100));
	  setP2(new Pants("Zara", "green", 80));
	  setP3(new Pants("chino", "black", 10));
	}
	  
	  
	// creation method calculate pants size
	public static void createCalculatePantsSize() {
		
		
		
		
		
		
		
	}
    
	
	//----- no lo se metodos -----
	public static void createAndTestObjectsPerson() {
		
		//i am going to create an object WITHOUT parameters, that is a empty object
		Person sergi = new Person();
		
		Person isa = new Person("Isabel", 18);
		
		Person toni = new Person("Antonio", 30, 80, 180, 2000);
		
		
		
		//sergi object, that is, tag "sergi" call toString Method_una cadena de operaciones
		
		sergi.toString();
		
		//and now i am poing to use toString to print this object
		
		System.out.println(sergi.toString());
		
		//this Eclipse IDE allows me to use object without toString
		System.out.println(toni);
		
		System.out.println(isa);
		
		sergi.setName("Sergi");
		sergi.setAge(20);
		sergi.setWeigth(60);
		sergi.setHeigth(100);
		sergi.setBasicSalary(2000);
		
		System.out.println(sergi);
		
		System.out.println("Sergi's age: " + sergi.getAge() + "\n");
		
		System.out.println("Toni's age: " + toni.getAge() + "\n"); // 30y ears
		toni.becomeOlder();
		
		System.out.println("Toni's age: " + toni.getAge() + "\n"); // 31years
		
	
	}
	
	public static void testMethodsObjectsPerson() {}
	
	public static void testListObjectsPerson() {
	
	 
		//create a variable people that is a ArrayList and assign a new ArrayListwhich
		//point to Person
		ArrayList<Person> people = new ArrayList<Person> ();
		
		//ceate three Person Objects
		//remember: i need three constructors!!
		Person alexa = new Person("Alexa", 25, 60, 180, 2500);
		Person jack = new Person("Jackson Pollock", 25);
		Person marc = new Person();
		
		//we add the previous created objects to People ArrayList
		people.add(alexa);
		people.add(jack);
		people.add(marc);
		
		// what do?
		//print people
		//How it works?
		//call printPeople -static method- with parameter people
		//people is an ArrayList of Person objects
		//llama a metodo printPiople con parametro people y imprima objectes que estan en la lista de Array
		printPeople(people);
		
		//System.out.println( people.toString() );
		
	}
	
	//------ utils ----
	 private static void printPeople(ArrayList<Person> arrayToPrint) {
		 
		 System.out.println("People:");
		 
		 for (Person personToPrint : arrayToPrint) {
			 System.out.println(personToPrint);
		 }
	     System.out.println("\n");
	}

	public static Pants getP1() {
		return p1;
	}

	public static void setP1(Pants p1) {
		TestPerson.p1 = p1;
	}

	public static Pants getP2() {
		return p2;
	}

	public static void setP2(Pants p2) {
		TestPerson.p2 = p2;
	}

	public static Pants getP3() {
		return p3;
	}

	public static void setP3(Pants p3) {
		TestPerson.p3 = p3;
	}
}
		
		
