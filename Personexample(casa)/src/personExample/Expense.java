package personExample;

public class Expense {
	
	public String name;
	public int value;
	public MyDate date;
	public Expense(String name, int value, MyDate date) {
		super();
		this.name = name;
		this.value = value;
		this.date = date;
	}
	public Expense() {
		super();
	}
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
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the date
	 */
	public MyDate getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(MyDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Expense [name=" + name + ", value=" + value + ", date=" + date + "]";
	}
	
	
	

}
