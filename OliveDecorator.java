package Q2;

public class OliveDecorator extends Decorator {
	private final int PRICE_FOR_OLIVES = 8;

	public OliveDecorator(Product product) {
		super(product);
		if (product instanceof Decorator) {
			tups.addAll(((Decorator) product).getTups());
		}else {
			tups.add(product.toString());
		}
		tups.add("Olives");
	}

	@Override
	public double getTotal() {
		double price = super.getTotal() + PRICE_FOR_OLIVES;
		return price;

	}
}
