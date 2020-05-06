class Program {
		public static String longestPalindromicSubstring(String str) {

		int maxLength = 0; int mid = -1; 
		
		for(int i=0 ; i<str.length()-1 ; i++){
			
			int oddLength = 0;
			
			if(i>0)
			 oddLength = findPalindromeLength(str, i, i-1, i+1) +1; 
			int evenLength = findPalindromeLength(str, i, i, i+1); 
			
			int currentLength = Math.max(oddLength, evenLength); 
			
			if(currentLength > maxLength){
				mid = i; 
				maxLength = currentLength ; 
			}
			
		}
	
		boolean isOdd = (maxLength % 2 ) == 1 ;
		
		int maxLeft = isOdd ? mid - maxLength/2 : mid - maxLength/2 + 1 ;
		
		int maxRight = mid+maxLength/2; 
		
			if(maxLength == 0) {
				return str ; 
			}
		return str.substring(maxLeft, maxRight+1); 
		
	}
	
	public static int findPalindromeLength (String str, int middle, int left, int right) {
		int length = 0; 
				
		while(left >=0 && right <= str.length()-1) {
		
			if( str.charAt(left) == str.charAt(right) ) {
				left-- ; 
				right++ ;		
				length = length + 2;
			} else {
				break; 
			}
		
		}
		
		return length ; 
		
	}
	
}
