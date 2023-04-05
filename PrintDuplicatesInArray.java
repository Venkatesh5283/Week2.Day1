package week2.Day1;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		
		
		
		for(int j=0;j<arr.length;j++)
		{
			
			for(int i=j+1;i<arr.length;i++)
			{
				if(arr[j]==(arr[i]))
				{
					System.out.println("Its Duplicate Values:"+arr[j]);
					
				}
			}
		}
	}

}
