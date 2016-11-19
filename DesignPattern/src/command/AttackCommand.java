package command;

//攻击命令类
public class AttackCommand extends Command {

	public AttackCommand(GameRole role) {
		//完成父类的够造函数
		super(role);
	}
	
	@Override
	public void ExcuteCommand() {
		role.Attack();
	}
	
	//返回标识字符
	public String toString(){
		return "Attack";
	}
}
