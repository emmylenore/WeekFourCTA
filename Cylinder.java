package weekFour;

public class Cylinder extends Shape {
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.height = height;
		this.radius = radius;
		
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return (2*Math.PI*radius*height) + (2*Math.PI*Math.pow(radius, 2));
	}

	@Override
	public double shapevolume() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}
	
	@Override
	public String toString() {
		return "Cylinder - Radius:" +radius + ", Height:" + height + ", Surface Area:" +surfaceArea() + ", Volume:" + shapevolume();
		
	}

}
