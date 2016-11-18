package adapter;

//球员抽象类
abstract class Player {
	
	protected String name;
	
	public Player(String name){
		this.name = name;
	}
	
	//进攻抽象方法
	public abstract void Attack();
	//防守抽象方法
	public abstract void Defense();
}
