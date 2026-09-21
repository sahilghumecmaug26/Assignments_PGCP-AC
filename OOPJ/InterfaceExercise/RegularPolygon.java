
public interface RegularPolygon {
	
	// abstract methods 
	
	int getNumSides();
	
	double getSideLength();
	
	// Static method 
	
	static int totalSides(RegularPolygon[] polygons) {
		int total = 0;
		
		for (int i = 0; i< polygons.length; i++) {
			total = total + polygons[i].getNumSides();		}
		return total ;
		
	}
	
	// Default method 
	
	default double getPerimeter() {
		return getNumSides()*getSideLength();
		
	}
	
	default double getInteriorAngle() {
		int n = getNumSides();
		return ((n-2)*Math.PI)/n;
	}
}
