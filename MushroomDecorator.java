package Q2;

public class MushroomDecorator extends Decorator {
	private final int PRICE_FOR_MUSH = 8;

	public MushroomDecorator(Product product) {
		super(product);
		if (product instanceof Decorator) {
			tups.addAll(((Decorator) product).getTups());
		}else {
			tups.add(product.toString());
		}

		tups.add("Mushrooms");
	}

	@Override
	public double getTotal() {
		double price = super.getTotal() + PRICE_FOR_MUSH;

		return price;
	}
}
