
public class Fibo {

	public static void main(String[] args) {
		int n=10;
		int f=0;
		int s=1;
		int next;
		int c;
		
		for (c=0;c<n;c++)
		{
			if(c<=1)
				next=c;
			else
			
				next=f+s;
				f=s;
				s=next;
				System.out.println(next);
		}
	}
}