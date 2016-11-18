package singleton;


//懒汉模式
public class Singleton_2 {
	
	//声明类的唯一实例
	private static Singleton_2 instance = null;
	
	//将构造方法私有化，不允许外部直接创建对象
	private Singleton_2(){
	}
	
	//提供用于获取实例的方法
	public static Singleton_2 getInstance(){
		if(instance == null)
			instance = new Singleton_2();
		return instance;
	}
}
