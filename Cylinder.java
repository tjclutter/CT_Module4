
public class Cylinder extends Shape{
	private double Radius;
	private double Height;
	
	Cylinder(double Radius, double Height){
		this.Radius = Radius;
		this.Height = Height;
		surface_area = 2 * Math.PI * Radius * (Radius + Height);
		volume = Math.PI * Radius * Radius * Height;
	}
	
	@Override
	public double surface_area() {
		surface_area = 2 * Math.PI * Radius * (Radius + Height);
		return surface_area;
	}

	@Override
	public double volume() {
		volume = Math.PI * Radius * Radius * Height;
		return volume;
	}
	
	@Override
	public String toString() {
		System.out.println("Surface area of cylinder is: " + surface_area);
		System.out.println("Volume of cylinder is: " + volume);
		String returnString = "surface area: " + String.valueOf(surface_area) + " Volume: " + String.valueOf(volume);
		return returnString;
	}
	
}
