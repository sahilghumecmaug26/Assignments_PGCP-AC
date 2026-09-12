//Question2

public class Triangle {
	
	int side1;
	int side2;
	int side3;

	
	Triangle(int l , int m , int n){
		side1 = l;
		side2 = m;
		side3 = n;
	}
	
	int perimeterofTriangle() {
		int perimeter = side1+side2 + side3;
		return perimeter;
	}
}
