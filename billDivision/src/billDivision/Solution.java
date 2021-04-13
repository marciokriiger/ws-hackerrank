package billDivision;

import java.util.ArrayList;
import java.util.List;

/*
 * bill: an array of integers representing the cost of each item ordered 
 * k: an integer representing the zero-based index of the item Anna doesn't eat 
 * b: the amount of money that Anna contributed to the bill
 * 
 * percorre bill
 * 	se (indice != k)
 * 		total += bill[indice]
 * 
 * se (total / 2 == b)
 * 	print("Bon Appetit")
 * senao
 * 	print(b - (total / 2))
 * 	
 */

public class Solution {
	
	static void bonAppetit(List<Integer> bill, int k, int b) {
		int total = 0;
		for(int i = 0; i < bill.size(); i++) {
			if (i != k) {
				total += bill.get(i);
			}
		}
		if( total / 2 == b) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b - (total / 2));
		}
		
		

    }
	
	public static void main(String[] args) {
		List<Integer> bill = new ArrayList<Integer>();
		bill.add(3);
		bill.add(10);
		bill.add(2);
		bill.add(9);
		bonAppetit(bill, 1, 12);

	}

}
