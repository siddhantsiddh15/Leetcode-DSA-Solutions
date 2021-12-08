package leetCOde_testing;

public class Arranging_Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 3;
		
		System.out.println(arrangeCoins(num)  + " Brute Force");
		System.out.print(arrangeCoinsBS(num));
	}
	
	
	public static int arrangeCoinsBS(int num) {
		
		
		if(num <=2) return 1;
		if(num ==3)return 2;
		long start = 2;
		long end = num/2;
		
		while(start<= end) {
			
			long mid = start + (end - start)/2;
			
			long temp = mid * (mid+1)/2;
			if(mid * (mid +1)/2  == num)return (int)mid;
			
			if(mid * (mid +1)/2  > num)end = mid-1;
			else {
				start = mid +1;
			}
			
		}
		return (int)end;
	}
	
	
	
	  public static int arrangeCoins(int n) {
	        
	        long sum =0;
	        for(long i =1; i<=n;i++){
	            
	            sum  = sum + i;
	            
	            if(sum>n)return (int)i-1;
	            else if(sum == n)return (int)i;
	            
	        }
	        return n;
	    }

}
