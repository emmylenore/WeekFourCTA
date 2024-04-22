package weekFour;

public class Sphere extends Shape {
	
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double shapevolume() {
		// TODO Auto-generated method stub
		return (4.0/3.0)* Math.PI * Math.pow(radius, 3);
	}
	
	@Override
	public String toString() {
		return "Sphere - Radius:" + radius + ", Surface Area: " + surfaceArea() + ", Volume:" + shapevolume();
		
	}
	

}
