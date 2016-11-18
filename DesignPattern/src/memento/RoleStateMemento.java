package memento;

//角色状态备忘录类，保存游戏角色当前状态
class RoleStateMemento {
	
	private int hp;//生命值
	private int attack;//攻击力
	private int defense;//防御力
	
	public RoleStateMemento(int hp,int attack,int defense){
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
}
