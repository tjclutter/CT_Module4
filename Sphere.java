
public class Sphere extends Shape{
	private double Radius;
	
	Sphere(double Radius){
		this.Radius = Radius;
		surface_area = 4 * Math.PI * Radius * Radius;
		volume = (4/3) * Math.PI * Radius * Radius * Radius;
	}
	
	@Override
	public double surface_area() {
		surface_area = 4 * Math.PI * Radius * Radius;
		return surface_area;
	}

	@Override
	public double volume() {
		volume = (4/3) * Math.PI * Radius * Radius * Radius;
		return volume;
	}
	
	@Override
	public String toString() {
		System.out.println("The surface area of the spere is " + surface_area);
		System.out.println("The volume of the sphere is " + volume);
		String returnString = "Surface area: " + String.valueOf(surface_area) + " Volume: " + String.valueOf(volume);
		return returnString;
	}
}
