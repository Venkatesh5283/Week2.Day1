package week2.Day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		
		
	//	for(int i=0;i<data.length;i++)
	//	{
	//		System.out.println("Sorted Array:"+data[i]);
	//		
	//	}
		Arrays.sort(data);
		int length=data.length;
		System.out.println("Second Last Element:"+data[length-2]);
	}

}
