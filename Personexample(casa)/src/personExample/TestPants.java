package personExample;

public class TestPants {
    public static void executePants() {
		
		createAndTestObjectsPants();
		CrearCalculoTalla();
		
	}
    public static void createAndTestObjectsPants() {
	
	//i am going to create an object WITHOUT parameters, that is a empty object
	   Pants p1 = new Pants("P1", "red", 50);
	
	   Pants p2 = new Pants("P2","black", 80);
	
	   Pants p3 = new Pants("P3","white", 180);
	
	    p1.setMarc = ("P1");
		p1.setColor = ("red");
		p1.seyPrice = (50);
  
		System.out.println(p1);
		
        System.out.println("P1 marc: " + p1.getPrice() + "\n");
		
		System.out.println("P2 marc: " + p2.getPrice() + "\n");
		//p2.becomeOlder();
		
		System.out.println("P3 marc: " + p3.getPrice() + "\n"); 
		
		
	}


      
      //crear metodo para calcular talla
		public static void CrearCalculoTalla() {
			
			int p1 = 50;
			int p2 = 80;
			int p3 = 120;
			
			
			System.out.println("Give your size");
			
			//int size 1 = scan.nextint(); 
			
			int size = 0;
			if (size > 20 && size <50 ) {
			System.out.println("Your size is S");
				
			//crear metodo personal		
			
	
			
			
			}
		
		}
}
