package facade;

class Facade {
	SubSystemOne one;
	SubSystemTwo two;
	SubSystemThree three;
	
	public Facade(){
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
	}
	
	public void MethodA(){
		System.out.println("方法组A-----");
		one.MethodOne();
		two.MethodTwo();
		three.MethodThree();
	}
	
	public void MethodB(){
		System.out.println("方法组B-----");
		two.MethodTwo();
		three.MethodThree();
	}
}
