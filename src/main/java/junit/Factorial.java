package junit;

public class Factorial {
	
	
	public int factorial(int num) {
		if (num < 0 ) {
			throw new ArithmeticException();
		}
		
		int result = 1;
		
		for(int i=2; i<=num ; i++) {
			result *=i;
			
		}
		return result;
	}
}
