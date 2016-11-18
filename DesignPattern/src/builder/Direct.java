package builder;

//指挥者类
class Direct {
	
	//指挥建造过程
	public void Construct(Builder builder){
		builder.BuildPartA();
		builder.BuildPartB();
	}
}
