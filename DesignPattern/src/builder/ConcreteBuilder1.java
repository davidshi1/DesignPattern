package builder;

//具体建造者1
class ConcreteBuilder1 extends Builder {
	
	private Product product = new Product();
	
	@Override
	public void BuildPartA() {
		product.Add("部件A");
	}

	@Override
	public void BuildPartB() {
		product.Add("部件B");
	}

	@Override
	public Product getProduct() {
		
		return product;
	}

}
