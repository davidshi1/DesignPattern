package builder;


//测试
public class Test {
	public static void main(String[] args) {
		Direct direct = new Direct();
		Product product1 = new Product();
		Product product2 = new Product();
		
		Builder cb1 = new ConcreteBuilder1();
		direct.Construct(cb1);
		product1 = cb1.getProduct();
		product1.show();
//		产品 创建 ---
//		部件A部件B
		
		Builder cb2 = new ConcreteBuilder2();
		direct.Construct(cb2);
		cb2.getProduct();
		product2 = cb2.getProduct();
		product2.show();
//		产品 创建 ---
//		部件C部件D
	}
}
