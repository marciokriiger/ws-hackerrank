package fibonacci;

public class Solution {
	
	/*	  
	 * cada termo subsequente corresponde a soma dos fibonaccis dos dois números anteriores
	 * n:      0, 1, 2, 3, 4, 5, 6,  7,  8,  9, 10,...
	 * return: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584... 
	 */
	
	static int fib(int n) {
		
		if(n < 2) {
			return n;
		} else {
			return fib(n - 1) + fib( n - 2);
		}	
	}

	public static void main(String[] args) {
		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(7));
		System.out.println(fib(10));
	}

}
