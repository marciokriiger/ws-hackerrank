package saveThePrisoner;

public class Solution {
	
	/*
	 * https://www.hackerrank.com/challenges/save-the-prisoner/problem
	 * 
	 */
	
	public static int saveThePrisoner(int n, int m, int s) {		
		int result;
	    result = (s + m - 1) % n;
	    if (result == 0){
	        result = n;
	    }
	    return result;			
	}
	
	public static void main(String[] args) {
		System.out.println(saveThePrisoner(5 , 2 , 2));
	}

}
