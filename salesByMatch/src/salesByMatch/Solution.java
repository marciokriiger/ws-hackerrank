package salesByMatch;

import java.util.Arrays;

public class Solution {
	
	/*
	 * cada num no array representa a cor de uma meia
	 * retornar o num de pares possiveis no array
	 * 
	 * int n = numero de meias no array
	 * ar = array de meias
	 * 
	 * percorro ar
	 * comparo o elemento atual com os demais
	 * se igual, result ++
	 *     
	 */

	
	static int sockMerchant(int n, int[] ar) {
		int result = 0;
		for(int i = 0; i < n; i++) {
			if(ar[i] != 0) {
				for(int j = i + 1; j < n; j++) {
					if(ar[i] == ar[j]) {					
						result++;
						ar[j] = 0;
						break;
					}
				}
			}
			
		}
		return result;		
    }

	public static void main(String[] args) {
		int n = 9;
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println(sockMerchant(n, ar));
		System.out.println(Arrays.toString(ar));
	}

}
