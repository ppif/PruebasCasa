package personExample;

public class Dog {
	
	//Campos de la clase dog
	
	public String name;
	public int age;
	public String colour;
	public int weight;
	
	
	//Constructor de la clase dog
	
	public Dog(String name, int age, String colour, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.colour = colour;
		this.weight = weight;
	}


	//Metodos de la clase dog
	
	public Dog(int i) {
		// TODO Auto-generated constructor stub
	}


	public Dog(int i, int age2, int j, int weight2) {
		// TODO Auto-generated constructor stub
	}


	public void train () {
		
		this.setColour(colour);
		
	}
	
	
	//Getters and Setters and toString
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}


	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}


	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}


	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", colour=" + colour + ", weight=" + weight + "]";
	}
	

	

}
