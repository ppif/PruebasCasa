package personExample;

public class TestDog {

	public static void executeDog() {
		
		createAndTestObjectsDog();
		

		
	}

	private static void createAndTestObjectsDog() {
		// Crear objeto
		
				Dog coco = new Dog("cocoliso", 2, null, 0);
				
				Dog maia = new Dog (1,2,5,6);
				
				
				//la etiqueta coco llama a metodo spring
				
				System.out.println(coco);
				System.out.println(maia);
	}
	
	
	}

