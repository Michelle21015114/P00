
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int add (int a, int b) {
		 return a + b;
		}
	
	public int subtract (int a, int b) {
		 return a - b;
		}
	
	public int multiple (int a, int b) {
		 return a * b;
		}
	
	public int divide (int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot be divided by 0!");
		}
		return a / b;
		}
	
	public double power(int a, int b) {
		return Math.pow(a, b);
	}
}
