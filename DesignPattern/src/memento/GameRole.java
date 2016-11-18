package memento;

//游戏角色类
class GameRole {
	private int hp;// 生命值
	private int attack;// 攻击力
	private int defense;// 防御力

	// 设置初始状态
	public void SetInitRoleState() {
		this.hp = 100;
		this.attack = 80;
		this.defense = 50;
	}

	// 保存游戏角色状态
	public RoleStateMemento SaveState() {
		return (new RoleStateMemento(hp, attack, defense));
	}

	// 恢复角色状态
	public void RecoveryRoleState(RoleStateMemento rsm) {
		this.hp = rsm.getHp();
		this.attack = rsm.getAttack();
		this.defense = rsm.getDefense();
	}
	
	//战斗
	public void Fight(){
		this.hp = 0;
		this.attack = 0;
		this.defense = 0;
	}
	
	// 展示游戏角色当前状态
	public void ShowRoleState() {
		System.out.println("当前状态----" + "HP:" + hp + " Attack:" + attack + " Defense:" + defense);
	}
	
}
