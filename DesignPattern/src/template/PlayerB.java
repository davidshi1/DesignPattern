package template;

//玩家B实现抽象方法
public class PlayerB extends Player {

	@Override
	public void BuyBlizzardGames() {
		System.out.println("暴雪游戏:魔兽世界，星际争霸2");
	}

	@Override
	public void BuyEAGames() {
		System.out.println("EA游戏:战地1，花园战争");
	}

	@Override
	public void BuySonyGames() {
		System.out.println("索尼游戏:最终幻想");
	}
}
