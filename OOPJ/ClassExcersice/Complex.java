//Question 4 


public class Complex {
	int real ;
	int imaginary;
	
	void add(Complex c) {
		int realResult = this.real + c.real;
		int imaginaryResult = this.imaginary + c.imaginary;
		
		System.out.println("sum is "+ realResult +"+"+imaginaryResult+"i");
	}
	
	void subtract(Complex c) {
		int realResult = this.real - c.real;
		int imaginaryResult = this.imaginary - c.imaginary;
		
		System.out.println("Difference is "+ realResult +"+"+imaginaryResult+"i");
	}
	
	void multipliCation(Complex c) {
		int realResult = (this.real * c.real) - (this.imaginary * c.imaginary);
		int imaginaryResult = (this.real * c.imaginary) + (this.imaginary *this.real);
		
		System.out.println("Product is :  "+ realResult +"+"+imaginaryResult+"i");
	}
}
