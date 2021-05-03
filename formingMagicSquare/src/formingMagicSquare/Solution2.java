package formingMagicSquare;

public class Solution2 {
	
	/*
	 * inputs: 1 - 9 (forms 15 value)
	 * explanation: https://www.youtube.com/watch?v=zPnN046OM34
	 * problem NOT SOLVED YET
	 * https://www.hackerrank.com/challenges/magic-square-forming/problem
	 */
	
	static int formingMagicSquare(int[][] s) {
		
		int dif = 0;
		int[] corner = {2,4,6,8};
		int[] cross = {1,3,7,9};
		int middle = 5;
		
		if(s[1][1] != middle) {
			dif += Math.abs(s[1][1] - middle);
		}
		
		for(int i = 0; i < corner.length; i++) {
		 	if(corner[i] != s[0][0]) {
		 		
		 	}
		}
		
		/*
		for(int j = 0; j < cross.length; j++) {
		 	if((cross[j] != s[0][1]) && (cross[j] != s[1][0]) && (cross[j] != s[1][2]) && (cross[j] != s[2][1])) {		 				 		
		 		dif += Math.abs(Math.min(Math.min(s[0][1] - cross[j], s[1][0] - cross[j]), Math.min(s[1][2] - cross[j], s[2][1] - cross[j])));
		 	}
		}
		*/
				
		return dif;
    }

	public static void main(String[] args) {
		 int s[][] = {{ 5, 3, 4 },
                 	  { 1, 5, 8 },
                 	  { 6, 4, 2 }};
		 
		 System.out.println(formingMagicSquare(s));

	}

}
