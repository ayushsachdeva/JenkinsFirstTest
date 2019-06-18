
public class calcSpace {


	public static void main(String[] args) {
		String str = new String("Anand Bokati is Good Boy");
		int count = 0;
		char[] chars = str.toCharArray();
		System.out.println("Number of Spaces are:");
		 for (int i=0; i<str.length();i++)
		 {
			 if(chars[i] == ' ')
				count++;
		 }
         System.out.print(count);
         System.out.println("Reverse of the String is:");
         for(int j=str.length()-1; j>=0;j--)
         {
        	 System.out.print(chars[j]);
         }
         System.out.println()
         ;
         String str2 = str.replaceAll("\\s", "");
         System.out.println(str2);
	}
	

}

