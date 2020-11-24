package Q2;

public class FamilyPizza extends Pizza implements Product {
	private final static int FAMILY_PRICE = 35;
	private final static int FAMILY_CALORIES = 300;

	public FamilyPizza(String name) {
		super(name, FAMILY_PRICE, FAMILY_CALORIES);
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
