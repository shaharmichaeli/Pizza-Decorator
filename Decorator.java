package Q2;

import java.util.ArrayList;

public abstract class Decorator implements Product {
	ArrayList<String> tups = new ArrayList<String>();
	private Product product;

	public Decorator(Product product) {
		this.product = product;
	}

	@Override
	public double getTotal() {
		return product.getTotal();
	}

	public Product getProduct() {
		return product;
	}

	public ArrayList<String> getTups() {
		return tups;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(tups.get(0) + ": ");
		for (int i = 1; i < tups.size(); i++) {
			if (i == tups.size() - 1) {
				sb.append("and ");
			} else {
				sb.append("With ");
			}
			sb.append(tups.get(i) + " ");
		}
		return sb.toString();
	}

}
