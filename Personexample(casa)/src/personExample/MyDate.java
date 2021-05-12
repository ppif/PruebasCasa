package personExample;

public class MyDate {
	
	public int day;
	public int month;
	public int year;
	
	
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}





	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}





	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}





	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}





	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}





	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}





	public MyDate() {
		super();
	}





	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	

}
