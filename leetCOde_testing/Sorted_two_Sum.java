package leetCOde_testing;

public class Sorted_two_Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-1,0, 5,6,11,12,13};
		
		int[]  ans = new int[2];
		
		ans = twoSum(nums, 23);
		
		
		for(int i =0; i<ans.length; i++) {
		System.out.print(
				
				ans[i]  + "  "
				
				);
		}
		
	}

	
	

	    public static int[] twoSum(int[] nums, int target) {
	        
	        int diff =0;
	        for(int i =0; i<nums.length-1; i++){
	            
	            diff = search(nums, i+1, target - nums[i]);
	            if(diff > -1){
	                return new int[]{i+1, diff+1};
	            }else{
	                continue;
	            }
	            
	        }
	        return new int[]{-1,-1};
	    }
	
	
	 public static int search(int[] arr, int i, int lookingFor){
	        
	        int start = i;
	        int end = arr.length-1 ;
	        
	        while(start<=end){
	            
	            int mid = start + (end -start)/2;
	            
	            if(arr[mid] == lookingFor)return mid;
	            
	            if(arr[mid] > lookingFor){
	                end = mid-1;
	            }else{
	                start = mid + 1;
	            }
	            
	        }
	        return -1;
	        
	    }
}
