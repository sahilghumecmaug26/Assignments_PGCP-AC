//Question 3 

public class Rectangle {
	
	int length;
	int breadth;
	
	Rectangle(int l , int b){
		length = l;
		breadth = b;
	}
	
	void areaOfRectangle() {
		int area = length*breadth;
		System.out.println("Area of rectangle : "+area);
	}

}
