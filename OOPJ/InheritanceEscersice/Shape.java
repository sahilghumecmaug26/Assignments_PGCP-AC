// Question 4 


public class Shape {
	void shapePrint() {
		System.out.println("This is a Shape");
	}
}

class Rectangle1 extends Shape{
	void rectanglePrint() {
		System.out.println("This is Rectangular shape");
	}
	
	
}

class Circle extends Shape {
	void circlePrint() {
		System.out.println("This is Circle Shape ");
	}
}

class Square1 extends Rectangle1{
	void squarePrint() {
		System.out.println("Square is a rectangle ");
	}
}

