package pickingNumbers;

import java.util.List;

/*
 * https://www.hackerrank.com/challenges/picking-numbers/problem
 * Test case: 4,6,5,3,3,1 > OUTPUT: 3 (4,3,3)
 */

public class Result {
	
	public static int pickingNumbers(List<Integer> a) {
		int result = 0;
		int countPlus = 1;
		int countMinus = 1;
		
		for(int i = 0; i < a.size(); i++) {
			for(int j = 0; j < a.size(); j++) {				
				if(i != j) {
					int comp = a.get(i);
					if(comp - a.get(j) == 0 || comp - a.get(j) == 1) {
						countPlus++;
					}
					if(comp - a.get(j) == -1 || comp - a.get(j) == 0) {
						countMinus++;
					}
				}
			}
			if(countPlus > countMinus) {
				if(countPlus > result) {
					result = countPlus;
				}									
			} else if (countPlus < countMinus) {
				if(countMinus > result) {
					result = countMinus;
				}				
			} else if (countPlus == countMinus) {
				result = countPlus;
			}
			countPlus = 1;
			countMinus = 1;
		}
		
		return result;
	}

}
