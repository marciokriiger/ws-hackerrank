package formingMagicSquare;

public class Solution {
	
	/*
	 * inputs: 1 - 9 (forms 15 value)
	 * explanation: https://www.youtube.com/watch?v=zPnN046OM34
	 * problem NOT SOLVED YET
	 * https://www.hackerrank.com/challenges/magic-square-forming/problem
	 */	
	
	static int formingMagicSquare(int[][] s) {
		int result = 0;
		int[] corner = {8,6,4,2};
		int[] cross = {9,7,3,1};
		int middle = 5;
		
		if(s[1][1] != middle) {
			result += Math.abs(s[1][1] - middle);
		}
		
		
		return result;		
    }

	public static void main(String[] args) {
		 int s[][] = {{4,5,8}, 
				      {2,1,1}, 
				      {1,9,7}};
		 
		 System.out.println(formingMagicSquare(s));

	}

}
