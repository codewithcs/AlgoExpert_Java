package AlgoExpert_Medium;

import java.util.Arrays;

public class SearchInASortedMatrix {

	public static void main(String[] args) {
		
		int[][] matrix = { { 1, 4, 7, 12, 15, 1000 },
						   { 2, 5, 19, 31, 1001 } , 
						   { 3, 8, 24, 33, 35, 1002 } , 
						   { 40, 41, 42, 44, 45, 1003 } , 
						   { 99, 100, 103, 106, 128, 1004 } 
						 } ;
		
		int target = 44; 
		
		System.out.println(searchInSortedMatrix(matrix, target));
		
	}
	
	public static int[] searchInSortedMatrix(int[][] matrix, int target) {

		int[] default1 = {-1, -1} ; 
		
		for(int i=0 ; i<matrix.length; i++ ){
						
			int index = Arrays.binarySearch(matrix[i], target); 
				
			if(index>0 && index <matrix[0].length)
			return new int[] { i, index } ; 
			
		}
		
		return default1 ; 
	}
		
	
}
