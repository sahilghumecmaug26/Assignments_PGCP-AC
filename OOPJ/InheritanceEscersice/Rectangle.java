
// Question 3 

public class Rectangle {
	int length ;
	int breadth;
	
	Rectangle(int l , int b){
		length = l;
		breadth = b ;
	}
	
	void area() {
		System.out.println("Area of Rectangle : "+ length*breadth);
		
	}
	
	void perimeter() {
		System.out.println(" PErimrter of triangle is : "+(2*(length+breadth)));
	}	
}


 class Square extends Rectangle {
	Square(int side){
		super(side ,side);
	}
}
