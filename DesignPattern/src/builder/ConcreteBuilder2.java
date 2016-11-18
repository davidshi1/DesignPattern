package builder;


//具体建造者2
class ConcreteBuilder2 extends Builder {
	
	private Product product = new Product();
	
	@Override
	public void BuildPartA() {
		product.Add("部件C");
	}

	@Override
	public void BuildPartB() {
		product.Add("部件D");
	}

	@Override
	public Product getProduct() {
		
		return product;
	}

}
