package hurdleRace;

import java.util.Collections;
import java.util.List;

// link: https://www.hackerrank.com/challenges/the-hurdle-race/problem

/*
 * inputs: k = 4 / height = 1 6 3 5 2 / output: 2
 */
public class Result {
	
	public static int hurdleRace(int k, List<Integer> height) {
				
		int max = Collections.max(height);
		
		if(k < max) {
			return max - k;
		} else {
			return 0;
		}
	}

}
