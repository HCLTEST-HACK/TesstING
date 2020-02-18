package hanndson;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;


public class ArrayOrders {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		Multimap<Integer, Integer> map1 = ArrayListMultimap.create();
        ArrayList<Integer> otherList = new ArrayList<Integer>();

		
		int n=5;
		int arr[]={1,2,3,4,5,6};
		int len = arr.length;
	   int sum=0;
		for(int i=0;i<len-1;i++){
		 for (int j=1;j<=len-1;j++){
		   sum=arr[i]+arr[j];
		   System.out.println("Sum:"+sum);
			if(sum%5==0){
				map1.put(arr[i], arr[j]);
				otherList.add(arr[i], arr[j]);
			   System.out.println(otherList);
			}
		 }
				
		}
		
		System.out.println(otherList);
		
	}

}
