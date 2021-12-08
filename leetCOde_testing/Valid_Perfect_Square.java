package leetCOde_testing;

public class Valid_Perfect_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;
		System.out.print(check(num));
		
	}
	
	public static boolean check(int num) {
		
		if(num<=1)return true;
		int start = 2;
		int end = num;
		
		while(start<=end) {
			double mid = start + (end - start)/2;
			
			if(mid == num/mid)return true;
			
			if(mid>num/mid)end = (int)mid -1;
			else {
				start = (int)mid +1;
			}
		}
		
		
		return false;
	}

}
