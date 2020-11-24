package Q2;

public class Pizza implements Product{
	
	private int price;
	private String name;
	private int calories;

	public Pizza(String name,int price, int calories) {
		this.calories = calories;
		this.name = name;
		this.price = price;
	}

	@Override
	public double getTotal() {
		return price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	

}
