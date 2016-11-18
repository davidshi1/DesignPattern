package bridge;


//测试类
public class Test {

	public static void main(String[] args) {
		HandsetBrand brand = null;
		
		//实例化M手机
		brand = new HandsetBrandM();
		//安装音乐软件
		brand.SetHandsetSoft(new HandsetMusicPlayer());
		//运行
		brand.run();
		
		//实例化N手机
		brand = new HandsetBrandN();
		//安装游戏软件
		brand.SetHandsetSoft(new HandsetGame());
		//运行
		brand.run();
		
//		M品牌手机: 运行手机音乐播放器
//		N品牌手机: 运行手机游戏
	}
}
