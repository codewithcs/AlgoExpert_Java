package AlgoExpert_Medium;

import java.util.ArrayList;
import java.util.List;

public class LongestPeak {

	public static void main(String[] args) {
	
		int[] array = { 1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2 } ;
		
		System.out.println(longestPeak(array));
	}
	
	public static int longestPeak(int[] array) {

		int max = 0 ; 
		int currentLength = 0; 
		
		List<Integer> list = new ArrayList<>() ;
		
		 
		for ( int i=0 ; i<array.length-1 ; i++ ) {
					
			System.out.println("List is : " + list );
			
			if(array[i] < array[i+1]  ) {								
							
				if( list.isEmpty() ) { // Corner Case: When filling the list first time. 
					currentLength = currentLength+2 ; 
					list.add(array[i]) ; 
					list.add(array[i+1]);
					
				}
				else {
				currentLength++ ; 		
				list.add(array[i+1]); 
				}
							
			} else if(array[i] > array[i+1]) { // 4 > 0
				
				// Peak will be found here. So, we set max in this else if. 
				
				if(currentLength > 1 )  { // Now look for strictly decreasing 
					
					currentLength++; 
					list.add(array[i+1]) ; 
					
					for (int j=i+1 ; j<array.length-1; j++) {
						
						if(array[j+1] < array[j] ) {
							currentLength++;  
							list.add(array[j+1]) ;  
						} else {
							i= j-1; // for optimization
							break; 
						}
						
					}
					
					if( currentLength > max ) {
						max = currentLength; 
					}
					
					
				}
				
				System.out.println("Peak numbers are : " + list);
				
				currentLength = 0; 
				
				list = new ArrayList<Integer>() ; 
				
			} else {
				currentLength = 0; 
				list = new ArrayList<Integer>() ; 
			}
			
		}
		
		return max;
	  }
	
	public static int peak(int[] array) {
	
		return 1; 
	}
	
}
