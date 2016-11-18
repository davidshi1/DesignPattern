package singleton;

//懒汉模式，采用双重锁定(Double-Check Locking)，来保证线程安全
public class Singleton_3 {

	// 声明类的唯一实例
	private static Singleton_3 instance = null;

	// 将构造方法私有化，不允许外部直接创建对象
	private Singleton_3() {
	}

	// 提供用于获取实例的方法
	public static Singleton_3 getInstance() {
		//先判断实例是否存在，不存在再加锁处理
		if (instance != null) {

		} else {
			synchronized (Singleton_3.class) {//加锁，同时只能有一个线程进入
				//第二层判断，判断之前的线程是否已经创建了实例，没有的话则创建
				if (instance == null) {
					instance = new Singleton_3();
				}
			}
		}
		return instance;
	}
}
