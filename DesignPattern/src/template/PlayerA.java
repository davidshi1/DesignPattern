package template;

//玩家A实现抽象方法
public class PlayerA extends Player {

	@Override
	public void BuyBlizzardGames() {
		System.out.println("暴雪游戏:守望先锋，暗黑破坏神3");
	}

	@Override
	public void BuyEAGames() {
		System.out.println("EA游戏:极品飞车13");
	}

	@Override
	public void BuySonyGames() {
		System.out.println("索尼游戏:神秘海域");
	}
}
