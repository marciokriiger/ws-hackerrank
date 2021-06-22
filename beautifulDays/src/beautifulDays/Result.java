package beautifulDays;

/*
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 * INPUT: i = 20, j = 23, k = 6; i-j range, k divisor
 * OUTPUT: 2
 */

public class Result {

	public static int beautifulDays(int i, int j, int k) {
		int result = 0, reverse = 0;
		while(i <= j) {
			reverse = reverseNumber(i);
			if( (i - reverse) % k == 0 ) {
				result++;
			}
			i++;
		}
		return result;
	}
	
	public static int reverseNumber(int n) {
		int reverse = 0;
		while(n != 0)
	    {
	      reverse = reverse * 10;
	      reverse = reverse + n % 10;
	      n = n/10;
	    }
		return reverse;
	}
}
