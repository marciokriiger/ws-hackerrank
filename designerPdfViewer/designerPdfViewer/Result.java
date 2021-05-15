package designerPdfViewer;

import java.util.List;

public class Result {
	// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
	
	/*
	 * inputs: 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 / abc
	 * output: 9
	 * 
	 * OBS: ASCII values start at 97
	 */
	
	public static int designerPdfViewer(List<Integer> h, String word) {
		int temp = 0, index = 0, result = 0;
		
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int asciivalue = ch;
			index = asciivalue - 97;
			temp = h.get(index);
			if(temp > result) {
				result = temp;
			}
		}
		
		return result * word.length();
	}

}
