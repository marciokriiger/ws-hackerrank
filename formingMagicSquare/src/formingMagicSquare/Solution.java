package formingMagicSquare;

public class Solution {
	
	/*
	 * inputs: 1 - 9 (forms 15 value)
	 * explanation: https://www.youtube.com/watch?v=zPnN046OM34
	 * problem NOT SOLVED YET
	 * https://www.hackerrank.com/challenges/magic-square-forming/problem
	 */
	
	// used to loop through the matrix
	static int N = 3;
	
	static int formingMagicSquare(int[][] s) {
		
		
        int diag1 = 0, diag2 = 0;
        int colSum = 0, rowSum = 0;
        int big = 0; // stores the biggest sum
        
        // calculate the sum of
        // the prime diagonal
        for (int i = 0; i < N; i++) {
        	diag1 = diag1 + s[i][i];
        	if(diag1 > big) {
        		big = diag1;
        	}
        	
        }
            
        // the secondary diagonal
        for (int i = 0; i < N; i++) {
        	diag2 = diag2 + s[i][N-1-i];
        	if(diag2 > big) {
        		big = diag2;
        	}
        }
		
        // For sums of each Row
        for (int i = 0; i < N; i++) {
        	rowSum = 0;
        	
            for (int j = 0; j < N; j++) {
            	rowSum += s[i][j];
            	if(rowSum > big) {
            		big = rowSum;
            	}
            }
                            
        }
  
        // For sums of each Column
        for (int i = 0; i < N; i++) {
        	colSum = 0;
        	
            for (int j = 0; j < N; j++) {
            	colSum += s[j][i];
            	if(colSum > big) {
            		big = colSum;
            	}
            }
                         
        }
		return big;
    }

	public static void main(String[] args) {
		 int s[][] = {{ 2, 7, 6 },
                 	  { 9, 5, 1 },
                 	  { 4, 3, 8 }};
		 
		 System.out.println(formingMagicSquare(s));

	}

}
