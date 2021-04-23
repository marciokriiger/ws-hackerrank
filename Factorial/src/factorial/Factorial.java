package factorial;

/*
 * Calculate a int factorial
 * NOT a HackerRank problem
 */

public class Factorial {
	
	static int factorial(int num) {
		int result = 1;
		while(num > 1) {
			result = result * num;
			num--;
			factorial(num);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

}
