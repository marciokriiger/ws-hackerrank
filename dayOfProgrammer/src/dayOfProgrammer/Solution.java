package dayOfProgrammer;

public class Solution {
	
	//calcular o 256 dia do ano
	
	/*
	 * 1700 - 1917 -> julian
	 * 1918 -> 14/02 32 day of year
	 * 1919 -> gregorian
	 * 
	 * calcula se calendário é julian ou gregorian
	 * caso 1918:
	 * 	26.09.1918
	 * caso julian:
	 * 	bissexto se ano / 4
	 * caso gregorian:
	 *  se ano / 4
	 *  	se ano !/ 100
	 *  	ano = bissexto
	 * 	senao
	 * 		se ano / 400
	 * 		ano = bissexto
	 * 
	 * calcula se ano é bissexto
	 * caso bissexto:
	 * 	12.09.ano
	 * caso nao-bissexto:
	 * 	13.09.ano 
	 */
	
	
	static String dayOfProgrammer(int year) {
		boolean leap = false;
		if(year == 1918) {
			return "26.09.1918";
		} else if (year < 1918) {
			if(year % 4 == 0) {
				leap = true;
			}
		} else if(year > 1918) {
			if(year % 400 == 0) {
				leap = true;
			} else {
				if(year % 4 == 0) {
					if(year % 100 != 0) {
						leap = true;
					}					
				}
			}
		}
		if(leap) {
			return "12.09." + year;
		} else {
			return "13.09." + year;
		}
	}
	 
	public static void main(String[] args) {
		System.out.println(dayOfProgrammer(1918));
	}

}
