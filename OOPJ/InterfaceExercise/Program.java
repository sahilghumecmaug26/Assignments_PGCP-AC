
public class Program {
	public static void main(String [] args) {
		EquilateralTriangle triangle = new EquilateralTriangle(10);
		Square square = new Square(5);
		
		 System.out.println("Triangle");
	     System.out.println("Number of sides: " + triangle.getNumSides());
	     System.out.println("Side length: " + triangle.getSideLength());
	     System.out.println("Perimeter: " + triangle.getPerimeter());
	     System.out.println("Interior angle: " + triangle.getInteriorAngle());
	     System.out.println();

	     System.out.println("Square");
	     System.out.println("Number of sides: " + square.getNumSides());
	     System.out.println("Side length: " + square.getSideLength());
	     System.out.println("Perimeter: " + square.getPerimeter());
	     System.out.println("Interior angle: " + square.getInteriorAngle());
	     
	     RegularPolygon[] polygons = {triangle,square};
	     
        int total = RegularPolygon.totalSides(polygons);
        
        System.out.println("Total number of sides: " + total);

	}
}
