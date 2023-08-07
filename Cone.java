//define class Cone that inherits from shape
public class Cone extends Shape{
	//define fields for radius and height
	private double Radius;
	private double Height;
	
	//declare constructor that takes radius and height, assigns them to variables then
	//calculates surface are and volume and assigns them to variables
	Cone(double Radius, double Height){
		this.Radius = Radius;
		this.Height = Height;
		surface_area = (Math.PI * Radius * Radius) + (Math.PI * Radius * Math.sqrt((Radius * Radius) + (Height * Height)));
		volume = (1.0/3) * Math.PI * Radius * Radius * Height;
	}
	
	//override method to calculate assign, and return surface area
	@Override
	public double surface_area() {
		surface_area = (Math.PI * Radius * Radius) + (Math.PI * Radius * Math.sqrt((Radius * Radius) + (Height * Height)));
		return surface_area;
	}
	
	//override method to calculate, assign, and return volume
	@Override
	public double volume() {
		volume = (1/3) * Math.PI * Radius * Radius * Height;
		return volume;
	}
	
	//override method to print surface area and volume then
	//convert to string and return to user
	public String toString() {
		System.out.println("Surface area of cone is: " + surface_area);
		System.out.println("Volume of cone is: " + volume);
		String returnString = "Surface area: " + String.valueOf(surface_area) + " Volume: " + String.valueOf(volume);
		return returnString;
	}
}
