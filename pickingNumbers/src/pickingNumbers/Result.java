package pickingNumbers;

import java.util.List;

/*
 * https://www.hackerrank.com/challenges/picking-numbers/problem
 * Test case: 4,6,5,3,3,1 > OUTPUT: 3 (4,3,3)
 * 
 */

public class Result {
	
	public static int pickingNumbers(List<Integer> a) {
		
		int result = 0, count = 1;
		for(int i = 0; i < a.size(); i++) {
			for(int j = 0; j < a.size(); j++) {
				if(i == j) {
					continue;
				}
				if(a.get(i) - a.get(j) == 0 || a.get(i) - a.get(j) == 1) {
					count++;
				}
			}
			if(count > result) {
				result = count;
			}
			count = 1;
		}
		return result;
	}

}
