package Q2;

public class TomatoDecorator extends Decorator {
	private final int PRICE_FOR_TOMATO = 8;

	public TomatoDecorator(Product product) {
		super(product);
		if (product instanceof Decorator) {
			tups.addAll(((Decorator) product).getTups());
		}else {
			tups.add(product.toString());
		}
		tups.add("Tomatos");
	}

	@Override
	public double getTotal() {
		double price = super.getTotal() + PRICE_FOR_TOMATO;

		return price;
	}

}
