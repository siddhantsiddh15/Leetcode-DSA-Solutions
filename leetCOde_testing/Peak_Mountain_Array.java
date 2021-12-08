package leetCOde_testing;

public class Peak_Mountain_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,5,3,2,0};
		
		System.out.println(search(arr));
		
	}
	
	public static int search(int[] arr) {
		
		   int start =0;
	        int end = arr.length-1;
	        
	        while(start<=end){
	            
	            int mid = start + (end - start)/2;
	            
	            if(mid ==0)mid = 1;
	            if(arr[mid]> arr[mid-1]){
	                start = mid +1;
	            }else{
	                // arr[i] < arr[i-1]
	                end = mid -1;
	            }
	        }
	        return end;
		
	}

}
