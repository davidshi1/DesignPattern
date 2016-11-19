package command;

//ÓÎÏ·½ÇÉ«Àà
class GameRole {
	
	private String name;
	
	public GameRole(String name){
		this.name = name;
	}
	
	//¹¥»÷ÃüÁî
	public void Attack(){
		System.out.println(name+" Attack");
	}
	//·ÀÓùÃüÁî
	public void Defense(){
		System.out.println(name+" Defense");
	}
	//ÖÎÁÆÃüÁî
	public void Heal(){
		System.out.println(name+" Heal");
	}
	
	public void AttackFriends(){
		System.out.println(name+" AttackFriends");
	}
}
