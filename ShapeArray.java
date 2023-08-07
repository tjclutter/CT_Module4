
public class ShapeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Sphere object with radius of two
		Sphere mySphere = new Sphere(2);
	
		//Create Cylinder object with radius 2 and height 4
		Cylinder myCylinder = new Cylinder(2,4);

		//create Cone object with radius 5 and height 4
		Cone myCone = new Cone(5,4);
		
		//create an array whose elements are from the Shape class
		Shape[] shapeArray = new Shape[3];
		//assign mySphere, myCylinder, and myCone to elements
		//0, 1, and 2, respectively, of shape array
		shapeArray[0] = mySphere;
		shapeArray[1] = myCylinder;
		shapeArray[2] = myCone;
		
		//iterate through shape array and print objects using toString method
		for (int i = 0; i < 3; i++) {
			shapeArray[i].toString();
		}
	}

}
