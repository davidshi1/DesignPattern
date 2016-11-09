package Builder;

public class BMWBuilder extends CarBuilder {

	@Override
	public void BuildWheel() {
		System.out.print("BMW wheel created!\n");
	}

	@Override
	public void BuildOilBox() {
		System.out.print("BMW oilBox created!\n");
	}

	@Override
	public void BuildBody() {
		System.out.print("BMW body created!\n");
	}

}
