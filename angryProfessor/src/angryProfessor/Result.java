package angryProfessor;

import java.util.List;

/*
 * https://www.hackerrank.com/challenges/angry-professor/problem
 */

public class Result {
	
	public static String angryProfessor(int k, List<Integer> a) {
		int onTime = 0;
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i) < 1) {
				onTime++;
			}
		}
		if(k <= onTime) {
			return "NO";
		} else {
			return "YES";
		}		
	}
}
