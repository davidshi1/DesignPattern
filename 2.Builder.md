#建造者模式
将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示

用了建造模式，用户就只需指定需要建造的类型就可以得到他们，而具体建造的过程和细节就不需知道了

***结构图***

![image](https://github.com/shishengjia/DesignPattern/blob/master/Pic/Builder.jpg)

**示例代码**

```java
//产品类
class Product {

	List<String> parts = new ArrayList<String>();

	// 添加部件
	public void Add(String part) {
		parts.add(part);
	}

	// 展示产品
	public void show() {
		System.out.println("\n产品 创建 ---");
		for (int i = 0; i < parts.size(); i++)
			System.out.print(parts.get(i));
	}
}
```

```java
//抽象建造者类，确定产品由PartA和PartB组成，并声明一个得到产品的方法
abstract class Builder {
	
	//建造PartA
	public abstract void BuildPartA();
	
	//建造PartB
	public abstract void BuildPartB();
	
	//得到产品
	public abstract Product getProduct();
}
```

```java
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
```

```java
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
```

```java
//指挥者类
class Direct {
	
	//指挥建造过程
	public void Construct(Builder builder){
		builder.BuildPartA();
		builder.BuildPartB();
	}
}
```

```java
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
```

**总结**

Builder是为创建一个Product对象的各个部件指定的抽象接口。

ConcreteBuilder是具体建造者，实现Builder接口，构造和装配各个部件。

Product当然是具体的产品。

Director是构建一个使用Builder接口的对象。

总的来说，建造者模式主要是用于创建一些复杂的对象，这些对象内部构建间的建造顺序通常是稳定的，但对象内部的构建通常面临着复杂的变化，如示例代码中，
两个产品都要构建PartA和PartB，但是PartA和PartB具体是什么这是不一样的。建造者模式的好处就是使得建造代码与表示代码分离，由于建造者隐藏了该产品是
如何组装的，所以若需改变一个产品的内部表示，只需要再定义一个具体的建造者就行了。
