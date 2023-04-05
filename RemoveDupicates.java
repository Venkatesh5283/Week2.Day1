package week2.Day1;

public class RemoveDupicates {

	public static void main(String[] args) {
		

		String input=" ";
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		
		String splt[]=text.split(" ");
		for(int i=0;i<splt.length;i++)
		{
			for(int j=1;j<splt.length;j++)
			{
				if (splt[i].equals(splt[j])) {
				 input = splt[i];
					count++;
			}
			}
				if(count>1)
				{
				System.out.println(text.replace(input," "));
			}
		}		
	

}
}
