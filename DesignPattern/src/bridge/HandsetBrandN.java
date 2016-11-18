package bridge;

//具体手机品牌N
class HandsetBrandN extends HandsetBrand {

	@Override
	public void run() {
		System.out.print("N品牌手机: ");
		handsetSoft.run();
	}
}
