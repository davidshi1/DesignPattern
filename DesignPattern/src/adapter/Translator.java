package adapter;

//∑≠“Î’ﬂ¿‡
class Translator extends Player{
	
	private ForeignPlayer fp = new ForeignPlayer();
	
	public Translator(String name) {
		super(name);
		fp.setName(name);
	}

	@Override
	public void Attack() {
		fp.Jinggong();
	}

	@Override
	public void Defense() {
		fp.Fangshou();
	}
	
}
