package catsAndMouse;

public class Solution {
	
	static String catAndMouse(int x, int y, int z) {
		
		int dif_x_z, dif_y_z;
		
		if(x > z) {
			dif_x_z = x - z;
		} else if (x < z) {
			dif_x_z = z - x;
		} else {
			dif_x_z = 0;
		}
		
		if(y > z) {
			dif_y_z = y - z;
		} else if (y < z) {
			dif_y_z = z - y;
		} else {
			dif_y_z = 0;
		}
		
		if(dif_x_z < dif_y_z) {
			return "Cat A";
		} else if(dif_x_z > dif_y_z) {
			return "Cat B";
		} else {
			return "Mouse C";
		}
    }

	public static void main(String[] args) {
		System.out.println(catAndMouse(1, 3, 2));

	}

}
