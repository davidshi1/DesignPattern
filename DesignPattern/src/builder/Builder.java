package builder;

//抽象建造者类，确定产品由PartA和PartB组成，并声明一个得到产品的方法
abstract class Builder {
	
	//建造PartA
	public abstract void BuildPartA();
	
	//建造PartB
	public abstract void BuildPartB();
	
	//得到产品
	public abstract Product getProduct();
}
