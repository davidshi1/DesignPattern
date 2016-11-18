package bridge;

//手机品牌抽象类
abstract class HandsetBrand {
	
	protected HandsetSoft handsetSoft;
	
	//设置手机软件
	public void SetHandsetSoft(HandsetSoft handsetSoft){
		this.handsetSoft = handsetSoft;
	}
	
	//运行手机软件
	public abstract void run();
}
