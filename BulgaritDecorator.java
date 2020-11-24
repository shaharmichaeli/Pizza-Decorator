package Q2;

public class BulgaritDecorator extends Decorator {
	private final int PRICE_FOR_BULGARIT = 8;

	public BulgaritDecorator(Product product) {
		super(product);
		if (product instanceof Decorator) {
			tups.addAll(((Decorator) product).getTups());
		}else {
			tups.add(product.toString());
		}
		tups.add("Bulgarit");
	}

	@Override
	public double getTotal() {
		double price = super.getTotal() + PRICE_FOR_BULGARIT;
		return price;
	}

}
