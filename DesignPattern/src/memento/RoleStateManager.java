package memento;

//角色状态管理者
class RoleStateManager {
	
	private RoleStateMemento memento;

	public RoleStateMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}
	
}
