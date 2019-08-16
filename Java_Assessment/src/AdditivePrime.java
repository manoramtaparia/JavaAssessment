public class AdditivePrime {
	
	/**
	 * Function to check whether a number is prime or not
	 * @param n Number
	 * @return boolean true/false
	 */
	public static boolean isPrime(int n) {
		int i, flag=0;
		for(i=2; i<=Math.sqrt(n); i++) {
			if(n%i == 0){
				flag=1;
				break;
				}
		}
		if(flag==0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		int rem,n;
		int arr[] = {2, 3, 19, 13, 25, 7,11,13,16};
		for(int i=0; i<arr.length; i++)
		{	
			int sum=0;  //to store the sum of all digits of the number
			n=arr[i];
			while(n>0) {
				rem=n%10;		//extracting the digits of the number
				n=n/10;
				sum=sum+rem;	//summing up the digits  and storing in sum
			}
			//checking if both the number and the sum of its elements is prime or not
			if(isPrime(arr[i]) && isPrime(sum)) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}

//The time complexity is O(n squared)