package AlgoExpert_Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
	
	public static void main(String[] args) {
		int[][] array = { {1} , {2}  , {3} , {4} , {5}  , {6} } ;// {{1, 2, 3, 4} , {8, 7, 6, 5} }; //{ {1, 2, 3, 4} , { 10, 11, 12, 5 }, {9, 8, 7, 6} } ; 
	
		System.out.println(spiralTraverse(array));
	}

	public static List<Integer> spiralTraverse(int[][] array) {
	    // Write your code here.

		List<Integer> list = new ArrayList<>() ;  
		
		int columnLeft = 0; int columnRight = array[0].length -1; 
		int rowTop = 0 ; int rowBottom = array.length-1; 
	
		int visited = 0; 
		
		System.out.println( "Total elements : " + array[0].length * array.length);
		
		while(visited < array[0].length * array.length ) {
					
			// Case 1: Ends row wise  
			
			if(rowTop == rowBottom) {
				
				for(int i=columnLeft ; i<=columnRight ; i++) { // Also includes when all 4 pointers are equal. 
					list.add(array[rowTop][i] ) ;
					visited++; 
					System.out.println("visited : " + visited);
				}
				
			}
			
			// Case 2: End Column Wise 
			else if(columnLeft==columnRight) {
				
				for(int i=rowTop ; i<=rowBottom ; i++) {
					list.add(array[i][columnLeft] ) ;
					visited++; 
					System.out.println("visited : " + visited);
				}
			}
			
			// Case 3: Ends Normally. 
			else {
						
				for(int i=columnLeft ; i<=columnRight ; i++) { // left to right 
					list.add(array[rowTop][i]) ; 
					visited++ ; 
					System.out.println("visited : " + visited);
				}			
				
				rowTop++ ; 
				
				for(int i=rowTop ; i<=rowBottom ; i++) { // top to bottom
					list.add(array[i][columnRight]) ; 
					visited++ ; 
					System.out.println("visited : " + visited);
				}
				
				columnRight-- ; 
			
				
				for(int i=columnRight ; i>=columnLeft ; i--) { // right to left
					list.add(array[rowBottom][i]) ; 
					visited++ ; 			
					System.out.println("visited : " + visited);
				}
				
				rowBottom--; 
				
				for(int i=rowBottom ; i>=rowTop ; i--) { // bottom to up 
					list.add(array[i][columnLeft]) ; 
					visited++ ; 
					System.out.println("visited : " + visited);
				}
			
				columnLeft++; 
			
			}
		}
				
				
		return list; 
			
	  }
	
}
