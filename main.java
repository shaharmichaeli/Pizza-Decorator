package Q2;

public class main {

	public static void main(String[] args) {

		Product fp = new BulgaritDecorator(new OliveDecorator(new HugePizza("Huge Pizza")));
		System.out.print(fp.toString() + " - Total Price : " + fp.getTotal());
		System.out.println();

		Product fppp = new TomatoDecorator(new BulgaritDecorator(new OliveDecorator(new PersonalPizza("Personal Pizza"))));
		System.out.print(fppp.toString() + "- Total Price : " + fppp.getTotal());
		System.out.println();

		Product s = new MushroomDecorator(new BulgaritDecorator(new OliveDecorator(new FamilyPizza("Family Pizza"))));
		System.out.print(s.toString() + " - Total Price : " + s.getTotal());

	}

}
