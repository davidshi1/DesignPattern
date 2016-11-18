package adapter;

//前锋类
class Forwards extends Player {
	
	//调用父类的构造方法
	public Forwards(String name) {
		super(name);
	}
	
	@Override
	public void Attack() {
		System.out.println("前锋:"+name+" attack");
	}

	@Override
	public void Defense() {
		System.out.println("前锋:"+name+" defense");
	}

}
