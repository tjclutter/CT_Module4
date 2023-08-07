//define class sphere that inherits from shape
public class Sphere extends Shape{
	//define double field Radius
	private double Radius;
	
	//initialize constructor for Sphere class that 
	//assigns values to Radius, surface_area, and volume
	Sphere(double Radius){
		this.Radius = Radius;
		surface_area = 4 * Math.PI * Radius * Radius;
		volume = (4/3) * Math.PI * Radius * Radius * Radius;
	}
	
	//override abstract method to assign surface_area
	@Override
	public double surface_area() {
		surface_area = 4 * Math.PI * Radius * Radius;
		return surface_area;
	}

	//override abstract method to assign volume
	@Override
	public double volume() {
		volume = (4/3) * Math.PI * Radius * Radius * Radius;
		return volume;
	}
	
	//override toString method to print surface area and volume
	//also converts surface_area and volume to Strings and returns values to user
	@Override
	public String toString() {
		System.out.println("The surface area of the spere is " + surface_area);
		System.out.println("The volume of the sphere is " + volume);
		String returnString = "Surface area: " + String.valueOf(surface_area) + " Volume: " + String.valueOf(volume);
		return returnString;
	}
}
