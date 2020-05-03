package AlgoExpert_Medium;

public class MonotonicArray {

	public static boolean isMonotonic(int[] array) {
	    // Write your code here.
			
			int count = 1 ; 
			
			// Case 1.
			for(int i=1 ; i<array.length; i++) {					
					if(count == i && array[i] >= array[i-1])  {
						count ++; 
					}			
				}
			
			if(count == array.length){
				return true; 
			}
			
			// Case 2
			count =1 ;  
			
			for(int i=1 ; i<array.length; i++) {					
					if(count == i && array[i] <= array[i-1])  {
						count ++; 
					}			
				}
	 			
		
			if(count == array.length){
					return true; 
				}
			
	    return false;
	    
	  } 
	
}
