package hanndson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practise {

	private static Scanner in;

	public static void fibonacci()
	{
		in = new Scanner(System.in);
		System.out.println("Please enter the position for Fibonacci series");
		int position = in.nextInt();
		int[] fibValues = new int[position+1];
		int x=0, y=1;
		fibValues[0] = x;
		
		if(position > 0)
		{
			fibValues[1] =  y;
			for(int i=2; i<position+1;i++)
			{
				fibValues[i] = fibValues[i-1]+fibValues[i-2];
			}
		}
		System.out.println("The fibonacci number in "+position+"th position is: "+fibValues[position]);
	}
	
	public static void main(String[] args)
	{
//		fibonacci();
//		int chkAgain = 1;
//		do{
//			System.out.println("Do you want to get fibonacci for any other position(Y/N):");
//			String inStr = in.next();
//			if("Y".equalsIgnoreCase(inStr))
//			{
//				fibonacci();
//			}
//			else
//			{
//				System.out.println("Thank you!!!");
//				chkAgain = 0;
//			}
//		}while(chkAgain > 0);
		absoluteArray();
	}
	
	public static void absoluteArray()
	{
		List<int[]> resultListArr = new ArrayList<int[]>();
		int[] arr = {1,2,3,4};
		int visiblity = 4;
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i]%visiblity == 0)
			{
				resultListArr.add(new int[]{arr[i]});
			}
			int index = 0;
			int[] midarray = new int[arr.length];
			midarray[index] = arr[i];index++;
			int j=i+1;
			int mid = 0;
			mid = arr[i];
			while(j<arr.length-1)
			{
				mid += arr[j];
				midarray[index] = arr[j];
				if(mid%visiblity == 0)
				{
					resultListArr.add(midarray);
				}
				while(index < arr.length)
				{
					mid +=arr[index];
					midarray[index] = arr[index];
					if(mid%visiblity == 0)
					{
						resultListArr.add(midarray);
					}
					index++;
				}
			}
				
			
		}
		
	}
}
