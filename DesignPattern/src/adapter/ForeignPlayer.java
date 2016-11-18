package adapter;

//外籍球员
class ForeignPlayer {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//进攻，与本土球员方法名不同
	public void Jinggong(){
		System.out.println("外籍球员:"+getName()+ " attack");
	}
	//防守，与本土球员方法名不同
	public void Fangshou(){
		System.out.println("外籍球员:"+getName()+ " defense");
	}
	
}
