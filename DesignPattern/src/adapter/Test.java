package adapter;

//测试类
public class Test {

	public static void main(String[] args) {
		Player player_1 = new Forwards("Tom");
		Player player_2 = new Center("Jack");
		Player player_3 = new Translator("姚明");
		
		player_1.Attack();
		player_1.Defense();
		
		System.out.println("=============");
		
		player_2.Attack();
		player_2.Defense();
		
		System.out.println("=============");
		
		player_3.Attack();
		player_3.Defense();
		
//		前锋:Tom attack
//		前锋:Tom defense
//		=============
//		中锋:Jack attack
//		中锋:Jack defense
//		=============
//		外籍球员姚明 attack
//		外籍球员姚明 defense
		
	}

}
