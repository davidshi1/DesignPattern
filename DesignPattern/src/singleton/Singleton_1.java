package singleton;

//饿汉模式，只要类加载了，实例就已经创建了
public class Singleton_1 {
	
	//创建类的唯一实例
	private static Singleton_1 instance = new Singleton_1();
	
	//将构造方法私有化，不允许外部直接创建对象
	private Singleton_1(){
	}
	
	//提供用于获取实例的方法
	public Singleton_1 getInstance(){
		return instance;
	}
}
