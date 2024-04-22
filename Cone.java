package weekFour;

public class Cone extends Shape {
	private double radius; 
	private double height;
	
	public Cone(double radius, double height) {
		this.height = height;
		this.radius = radius;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		double coneHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
		return Math.PI*radius*(radius+coneHeight);
	}

	@Override
	public double shapevolume() {
		// TODO Auto-generated method stub
		return (1.0/3/0)*Math.PI*Math.pow(radius, 2)*height;
	}
	
	@Override
    public String toString() {
        return "Cone - Radius: " + radius + ", Height: " + height + ", Surface Area: " + surfaceArea() + ", Volume: " + shapevolume();

	}}
