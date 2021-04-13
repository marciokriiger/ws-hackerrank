package migratoryBirds;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	static int migratoryBirds(List<Integer> arr) {		
		
		int[] types = new int[5];
		int aux = 0;
		int index = 0;
		
		for (int i = 0; i < arr.size(); i++) {
			switch (arr.get(i)) {
			  case 1:
			    types[0]++; 
			    break;
			  case 2:
				types[1]++;
			    break;
			  case 3:
				types[2]++;
			    break;
			  case 4:
				types[3]++; 
				break;
			  case 5:
				types[4]++;    
				break;
			}
		}
		for (int j = 0; j < types.length; j++) {
			if(types[j] > aux) {
				index = j;
				aux = types[j];
			}
		}
		return index + 1;
    }
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(4);
		arr.add(4);
		arr.add(4);
		arr.add(5);
		arr.add(3);
		System.out.println(migratoryBirds(arr));

	}

}
