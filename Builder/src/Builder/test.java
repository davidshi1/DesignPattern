package Builder;

public class test {
	public static void main(String args[]){
			BMWBuilder bb  =new BMWBuilder();
			CarDirector cd = new CarDirector(bb);
			cd.CreateCar();
			
			BznZBuilder bzb  =new BznZBuilder();
			CarDirector cd_2 = new CarDirector(bzb);
			cd_2.CreateCar();
	}
}	
