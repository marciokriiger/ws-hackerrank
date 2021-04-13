package countingValleys;

public class Result {
	
	// calcula quantos hills o hiker entrou
	
	/*
	 * verifico se valor ficou negativo
	 * caso sim, incremento o retorno
	 * verifico se fica novamente negativo 
	 * caso sim, incremento novamente
	 */
	
	public static int countingValleys(int steps, String path) {
		int hills = 0;
		int count = 0;
		
		for(int i = 0; i < path.length(); i++) {
			if(path.charAt(i) == 'D') {
				count--;
				if(count == -1) {
					hills++;
				}
			} else {
				count++;
			}			
		}
		
		return hills;	    

	}

}
