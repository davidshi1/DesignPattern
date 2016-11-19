package command;

//测试类
public class Test {

	public static void main(String[] args) {
		//创建角色
		GameRole role = new GameRole("Tom");
		
		//创建命令,并绑定角色role
		Command command_1 = new AttackCommand(role);
		Command command_2 = new DefenseCommand(role);
		Command command_3 = new HealCommand(role);
		Command command_4 = new AttackFriendsCommand(role);
		
		//设置命令
		Operate operate = new Operate();
		operate.SetCommands(command_1);
		operate.SetCommands(command_2);
		operate.SetCommands(command_3);
		operate.SetCommands(command_4);
		
		//执行命令
		operate.Notify();
		
//		2016-11-19 19:04:28 add command:Attack
//		2016-11-19 19:04:28 add command:Defense
//		2016-11-19 19:04:28 add command:Heal
//		2016-11-19 19:04:28 add command:AttackFriends
//		Tom Attack
//		Tom Defense
//		Tom Heal
//		Warning You can not attack your friends!!!
	}

}
