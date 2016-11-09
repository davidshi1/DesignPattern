import java.awt.Shape;


public class test {
	public static void main(String args[]){
		shape s = new Adapter();
		s.draw();
		
		shape s2 = new Line();
		s2.draw();
	}
}
