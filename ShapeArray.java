
public class ShapeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere mySphere = new Sphere(2);
	
		
		Cylinder myCylinder = new Cylinder(2,4);

		
		Cone myCone = new Cone(5,4);
		
		
		Shape[] shapeArray = new Shape[3];
		shapeArray[0] = mySphere;
		shapeArray[1] = myCylinder;
		shapeArray[2] = myCone;
		for (int i = 0; i < 3; i++) {
			shapeArray[i].toString();
		}
	}

}
