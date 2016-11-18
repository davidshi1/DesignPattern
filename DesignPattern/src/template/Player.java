package template;

abstract class Player {
	
	//模板方法，给出逻辑框架
	public void BuyGames(){
		System.out.println("所购游戏如下:");
		BuySonyGames();
		BuyEAGames();
		BuyBlizzardGames();
	}
	
	//抽象行为放到子类去实现
	public abstract void BuyBlizzardGames();
		

	public abstract void BuyEAGames();
		

	public abstract void BuySonyGames();
		
}
