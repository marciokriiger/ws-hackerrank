package stringHour;

/*
 * calculates hour and minutes and returns a string
 * Ex: 63 returns 1:03
 * NOT a HackerRank problem
 */

public class StringHour {
	
	static String stringHour(int hour) {
		int hours = (hour/60);
		int minutes = (hour % 60);
		
		return (minutes < 10) ? hours + ":" + "0" + minutes : hours + ":" + minutes;		
	}

	public static void main(String[] args) {
		System.out.println(stringHour(119));
	}

}
