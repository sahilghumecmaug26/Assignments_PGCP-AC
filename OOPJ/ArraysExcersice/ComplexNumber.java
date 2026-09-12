
public class ComplexNumber {
	
	private int num1;
	private int num2;
	
	public void setNum1(int num){
		this.num1 = num;
	}
	
	public void setNum2(int num){
		this.num2 = num;
	}
	
	public int getNum1() {
		return num1;
		
	}
	
	public int getNum2() {
		return num2;
		
	}
	
	public int computeComplexNumber() {
		return num1*num2;
	}

}
