package sub1;

public class CSphere {
	public double radius;
	public CSphere(double r) {
		radius=r;
	}
	public void show() {
		System.out.println("radius="+radius);
		System.out.println("球體的體積:"+((4/3)*3.14*radius*radius*radius));
	}
}
