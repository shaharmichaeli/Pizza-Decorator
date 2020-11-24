package Q2;

public class PersonalPizza extends Pizza implements Product {
	private static final int PERSONAL_CALORIES = 100;
	private static final int PERSONAL_PRICE = 20;
	
	public PersonalPizza(String name) {
		super(name,PERSONAL_PRICE,PERSONAL_CALORIES);
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
