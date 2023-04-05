package week2.Day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		String splt[]=test.split(" ");
		for (int i = 0; i < splt.length; i++) {
			//System.out.println(split[i]);
			
			
			if (i%2!=0) {
				
				char[] ch = splt[i].toCharArray();
				
				for (int j =ch.length-1; j >=0; j--) {
					
					System.out.print(ch[j]);
					
				}
				
				}
			else
			{
				System.out.print(" "+splt[i]+" ");
			}

	}
	}

}
