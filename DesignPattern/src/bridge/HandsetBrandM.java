package bridge;


//具体手机品牌M
class HandsetBrandM extends HandsetBrand {

	@Override
	public void run() {
		System.out.print("M品牌手机: ");
		handsetSoft.run();
	}

}
