import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class splitString {
	public static void main(String[] args) throws Throwable {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int space=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ')
				space++;
		}
		String arr[]=new String[space+1];
		String nstr="";
		for(int i=0,j=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				arr[j]=nstr;
				j++;
				nstr="";
			}
			else{
				nstr=nstr+str.charAt(i);
			}
		arr[j]=nstr;
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
 
}
