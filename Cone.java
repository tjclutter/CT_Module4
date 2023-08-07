
public class Cone extends Shape{
	private double Radius;
	private double Height;
	
	Cone(double Radius, double Height){
		this.Radius = Radius;
		this.Height = Height;
		surface_area = (Math.PI * Radius * Radius) + (Math.PI * Radius * Math.sqrt((Radius * Radius) + (Height * Height)));
		volume = (1.0/3) * Math.PI * Radius * Radius * Height;
	}
	
	@Override
	public double surface_area() {
		surface_area = (Math.PI * Radius * Radius) + (Math.PI * Radius * Math.sqrt((Radius * Radius) + (Height * Height)));
		return surface_area;
	}
	
	@Override
	public double volume() {
		volume = (1/3) * Math.PI * Radius * Radius * Height;
		return volume;
	}
	
	public String toString() {
		System.out.println("Surface area of cone is: " + surface_area);
		System.out.println("Volume of cone is: " + volume);
		String returnString = "Surface area: " + String.valueOf(surface_area) + " Volume: " + String.valueOf(volume);
		return returnString;
	}
}
