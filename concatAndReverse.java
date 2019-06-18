
public class concatAndReverse {

	public static void main(String[] args) {
		String Str1 = "Anand";
		String Str2 = "Bokati";
		String Str3 = Str1+" "+Str2;
		System.out.println("String1:"+Str1);
		System.out.println("String2:"+Str2);
		System.out.println(Str3);
		char[] chars = Str3.toCharArray();
		
		System.out.println("Revers of String is");
		    for(int i=Str3.length()-1;i>=0;i--)
		    {
		    	System.out.print(chars[i]);
		    }

	}

}
