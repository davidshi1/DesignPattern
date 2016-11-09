package Builder;

public class CarDirector {
	
	private CarBuilder cb;
	public CarDirector(CarBuilder cb){
		this.cb = cb;
	}
	
	public void CreateCar(){
		cb.BuildBody();
		cb.BuildOilBox();
		cb.BuildWheel();
		System.out.print("Car is assembled!\n");
	}
}
