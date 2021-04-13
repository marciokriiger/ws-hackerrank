package drawingBook;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	
	/*
	 * solution: https://www.hackerrank.com/challenges/drawing-book/forum/comments/588382
	 */
	
	static int pageCount(int n, int p) {
		int totalPageTurnCountFromFront = n / 2;
		int targetPageTurnCountFromFront = p / 2;
		int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

		return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);
				       
    }

	public static void main(String[] args) {
		System.out.println(pageCount(37455, 29835));
	}

}
