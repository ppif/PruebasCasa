package personExample;

public class Pants {

	//fielda from Pants Class
	
       public String marc;
       public String color;
       public int price;
       public String setMarc;
       public String setColor;
       public int seyPrice;
	
    //Constructor from  Class 
       public Pants(String marc, String color, int price) {
   	
   		this.marc = marc;
   		this.color = color;
   		this.price = price;
   	}
      
     //Getters and Setters and toString
       @Override
   	public String toString() {
   		return "Pants [marc=" + marc + ", color=" + color + ", price=" + price + "]";
   	}

	public String getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	
          

	}

