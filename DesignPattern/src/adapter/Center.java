package adapter;

//中锋类
class Center extends Player {
	
	//调用父类的构造方法
	public Center(String name) {
		super(name);
	}

	@Override
	public void Attack() {
		System.out.println("中锋:"+name+" attack");
	}

	@Override
	public void Defense() {
		System.out.println("中锋:"+name+" defense");
	}

}
