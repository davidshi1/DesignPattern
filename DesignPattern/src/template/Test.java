package template;

public class Test {
	public static void main(String args[]){
		Player a = new PlayerA();
		Player b = new PlayerB();
		
		a.BuyGames();
		System.out.println("=====================");
		b.BuyGames();
		
//		所购游戏如下:
//		索尼游戏:神秘海域
//		EA游戏:极品飞车13
//		暴雪游戏:守望先锋，暗黑破坏神3
//		=====================
//		所购游戏如下:
//		索尼游戏:最终幻想
//		EA游戏:战地1，花园战争
//		暴雪游戏:魔兽世界，星际争霸2
	}
}
