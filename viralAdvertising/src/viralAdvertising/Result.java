package viralAdvertising;

public class Result {
	
	/*
	 * https://www.hackerrank.com/challenges/strange-advertising/problem
	 * input: the day number to report
	 * output: the cumulative likes at that day
	 * 
	 * chamar viralAdvertising(n-1)
	 * 
	 */
	
	public static int viralAdvertising(int n) {		
		int cumulative = 0, shared = 0, liked = 0;
		for(int i = 0; i < n; i++) {			
			if(i == 0) {
				shared = 5;
				liked = 2;
				cumulative = 2;
			} else {
				shared = liked * 3;
				liked = Math.floorDiv(shared, 2);
				cumulative += liked;
			}			
		}			
		return cumulative;
	}
}
