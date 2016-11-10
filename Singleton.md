#单例模式
[视频教程](http://www.imooc.com/learn/112)<br>
**应用场合:**有些对象只需要一个的时候<br>
**作用:**保证整个应用程序中某个实例有且只有一个<br>
**类型**<br>
* 饿汉模式<br>
* 懒汉模式


##饿汉模式
```java
//只要类加载了，实例就已经创建了
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
```


##懒汉模式
```java
//当用户创建一个实例时，以后就不再创建了，直接返回一个实例
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
```

| 区别           |               |       
| ------------ |:------------:| 
| 饿汉模式      | 加载类时比较慢，因为会先创建一个实例，但运行时获取对象的速度比较快，线程安全 |
| 懒汉模式      | 加载类时比较快，但运行时获取对象的速度比较慢，因为需要新建一个对象，线程不安全 | 
