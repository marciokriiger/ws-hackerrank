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
		
		if((s[0][0] + s[0][1] + s[0][2]) != 15) {
            result += Math.abs(15 - (s[0][0] + s[0][1] + s[0][2]));
        }
        if((s[1][0] + s[1][1] + s[1][2]) != 15) {
            result += Math.abs(15 - (s[1][0] + s[1][1] + s[1][2]));
        }
        if((s[2][0] + s[2][1] + s[2][2]) != 15) {
            result += Math.abs(15 - (s[2][0] + s[2][1] + s[2][2]));
        }
		
		return result;		
    }

	public static void main(String[] args) {
		 //expected 14 
		 int s[][] = {{4,5,8}, 
				      {2,1,1}, 
				      {1,9,7}};
		 
		 System.out.println(formingMagicSquare(s));

	}

}
