package command;

//命令抽象类
abstract class Command {
	protected GameRole role;
	
	//用构造方法来绑定角色
	public Command(GameRole role) {
		this.role = role;
	}
	
	//执行命令抽象方法，由具体的子类去实现
	abstract public void ExcuteCommand();
}
