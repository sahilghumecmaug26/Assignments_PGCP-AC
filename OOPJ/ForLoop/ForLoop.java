
public class ForLoop {
	
	public static void main(String [] args) {
		
		displayOddNumbers();
		displayEvenNumbers();
	displaySeventh();
	displayTriangle();
		displayTriangle1();
		displayNumberTriangle();
		displayNumberTriangle1();
		displayNumberTriangle2();
	}
	
static	void displayOddNumbers(){
		for(int i=0 ; i<1000;i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}

static void displayEvenNumbers() {
	for(int i=0; i<=500; i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
}

static void displaySeventh() {
	for(int i= 1 ; i<=200 ; i+=7) {
		System.out.println(i);
	}
}

static void displayTriangle() {
	for(int i=0 ; i< 5 ; i++) {
		for (int j = 0; j < 5 ; j++) {
			System.out.print("*");
			if(i==j) {
				break;
			}
		}
		
		System.out.println();
	}	
}

static void displayTriangle1() {
	for(int i=0 ; i<=5 ; i++) {
		for (int j = 5; j >= 0 ; j--) {
			System.out.print("*");
			if(i==j) {
				break;
			}
		}
		
		System.out.println();
	}

}

static void displayNumberTriangle() {
	int temp =1;
	for(int i=0 ; i< 4 ; i++) {
		for (int j = 0; j < 4 ; j++) {
			System.out.print(temp);
			if(i==j) {
				break;
			}
			temp++;
		}
		 temp++;
		System.out.println();
	}	

}

static void displayNumberTriangle1() {
	
	for(int i=1 ; i<=6 ; i++) {
		for (int j = 1; j <=6 ; j++) {
			System.out.print(j);
			if(i==j) {
				break;
			}
			
		}
		
		System.out.println();
	}	

}

static void displayNumberTriangle2() {
	for(int i=6 ; i>=1 ; i--) {
		for (int j = 1; j <= i ; j++) {
			System.out.print(j);

		}
		
		System.out.println();
	}

}

}
