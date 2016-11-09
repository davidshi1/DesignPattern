package Builder;

public class BznZBuilder extends CarBuilder {

	@Override
	public void BuildWheel() {
		System.out.print("BznZ wheel created!\n");
	}

	@Override
	public void BuildOilBox() {
		System.out.print("BznZ oilBox created!\n");
	}

	@Override
	public void BuildBody() {
		System.out.print("BznZ body created!\n");
	}

}
