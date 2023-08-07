//define public class Cylinder that inherits from Shape
public class Cylinder extends Shape{
	//define double fields for Radius and Height
	private double Radius;
	private double Height;
	
	//define cylinder constructor that takes a radius and height then
	//assigns them to variables and calculates surface area and volume then assigns to variables
	Cylinder(double Radius, double Height){
		this.Radius = Radius;
		this.Height = Height;
		surface_area = 2 * Math.PI * Radius * (Radius + Height);
		volume = Math.PI * Radius * Radius * Height;
	}
	
	//override method to calculate, assign, then return surface area
	@Override
	public double surface_area() {
		surface_area = 2 * Math.PI * Radius * (Radius + Height);
		return surface_area;
	}
	
	//override method to calculate, assign, then return volume
	@Override
	public double volume() {
		volume = Math.PI * Radius * Radius * Height;
		return volume;
	}
	
	//override method to print surface area and volume, convert to string then return to user
	@Override
	public String toString() {
		System.out.println("Surface area of cylinder is: " + surface_area);
		System.out.println("Volume of cylinder is: " + volume);
		String returnString = "surface area: " + String.valueOf(surface_area) + " Volume: " + String.valueOf(volume);
		return returnString;
	}
	
}
