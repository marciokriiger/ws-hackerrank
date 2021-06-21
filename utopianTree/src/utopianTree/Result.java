package utopianTree;

public class Result {
	
	public static int utopianTree(int n) {
		int result = 0;
		if(n < 3) {
			return n + 1;
		} else {			
			if(n % 2 != 0) {
				result = utopianTree(n - 1) * 2;
			} else {
				result = utopianTree(n - 1) + 1;				
			}
			return result;
		}		
	}
}
