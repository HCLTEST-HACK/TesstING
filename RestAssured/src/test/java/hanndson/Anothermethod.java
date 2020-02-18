package hanndson;

import java.util.Scanner;

public class Anothermethod {

		    static int fib(int n) 
	    { 
	        if (n <= 1) 
	            return n; 
	        return fib(n - 1) + fib(n - 2); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	       // int n = 1;
	    	Scanner scan = new Scanner(System.in);
			System.out.println("Enter the position number for fibnacci:");
			  
			int n=scan.nextInt();
	        System.out.println(fib(n)); 
	    } 
	} 
	
		




