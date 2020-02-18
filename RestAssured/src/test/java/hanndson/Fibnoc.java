package hanndson;

import java.util.Scanner;

public class Fibnoc {
	
	public static int fibres(int n){
		
		int dp[]=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++){
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[n];
		
		
	}

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String option = "y";
		
		while("Y".equalsIgnoreCase(option)){
	
		System.out.println("Enter the position number for fibnacci:");
		
		
		int n=scan.nextInt();
		
		if(n < 0) 
			System.out.println("Please enter the valid positon ");
		else
	     	System.out.println(fibres(n));
		
		System.out.println("Do you want check again:");
		option=scan.next();


		
		};
		
		
	}
	
}

