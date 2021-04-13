package divisibleSumPairs;

import java.util.Scanner;

public class Solution {

	static int divisibleSumPairs(int n, int k, int[] ar) {
		
		int result = 0;
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = i + 1; j < ar.length; j++) {
				int aux = ar[i] + ar[j];
				if(aux % k == 0 ) {
					result++;
				}
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] nk = scanner.nextLine().split(" ");
				
        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];
        
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        
        int result = divisibleSumPairs(n, k, ar);
        
        scanner.close();
        
        System.out.println(result);

	}

}
