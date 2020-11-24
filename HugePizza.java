package Q2;

public class HugePizza extends Pizza implements Product {
	final static private int HUGE_PRICE = 55;
	final static private int HUGE_CALORIES = 300;
	
	public HugePizza(String name) {
		super(name,HUGE_PRICE,HUGE_CALORIES);
	}
	
	public Pizza getPizza() {
		return this;
	}
	
	
	@Override
	public double getTotal() {
		return super.getTotal();
	}
	
	public int getPrice() {
		return super.getPrice();
	}



	public void setPrice(int price) {
		super.setPrice(price);
	}



	public String getName() {
		return super.getName();
	}



	public void setName(String name) {
		super.setName(name);
	}



	public int getCalories() {
		return super.getCalories();
	}



	public void setCalories(int calories) {
		super.setCalories(calories);
	}
	

	@Override
	public String toString() {
		return super.getName();
	}
	

}
