package array;

public class LeeCode_905_042 {
    public static int[] sortArrayByParity(int[] A) {
        
		int oddSize = 0;
		
		for(int i =0;i< A.length; i++){
			if(A[i]%2 !=0){
				oddSize++;
			}
		}
		int start =0;
		int end = A.length-1;
		
		if(oddSize > 0 && oddSize < A.length){
			while(oddSize >0 || start< end){
				if(A[start]%2 !=0){
					oddSize--;
					for(int j =end; j> start; j--){
						if((A[j]%2) == 0){
							int temp = A[start];
							A[start] = A[j];
							A[j]= temp;							
							end = j-1;
							break;
						}	
					}
				}
				start ++;
			}
					
		}
		return A;
    }
    public static void main(String[] args){
    	int[] A ={1,2,3,4,5,6,7,8,9,10};
    	LeeCode_905_042.sortArrayByParity(A);
    	for(int i =0; i< A.length ;i++){
    		System.out.println(A[i]);
    	}
    }
}
