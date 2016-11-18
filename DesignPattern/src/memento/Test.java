package memento;

//测试类
public class Test {

	public static void main(String[] args) {
		//创建游戏角色
		GameRole role = new GameRole();
		//初始化角色状态
		role.SetInitRoleState();
		
		//显示战斗前角色状态
		System.out.print("战斗前:");
		role.ShowRoleState();
		
		//创建角色状态管理者，并保存当前角色状态
		RoleStateManager manager = new RoleStateManager();
		manager.setMemento(role.SaveState());
		
		//战斗后显示角色状态
		role.Fight();
		System.out.print("战斗后:");
		role.ShowRoleState();
		
		//回档到战斗前角色状态
		role.RecoveryRoleState(manager.getMemento());
		System.out.print("回档后:");
		role.ShowRoleState();
		
//		战斗前:当前状态----HP:100 Attack:80 Defense:50
//		战斗后:当前状态----HP:0 Attack:0 Defense:0
//		回档后:当前状态----HP:100 Attack:80 Defense:50
	}

}
