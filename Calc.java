
public class Calc {
	public int add(int a,int b)
	{
		System.out.println("Sum of number is"+" "+(a+b));
		return 0;
	}
	
	public static void main(String args[])
	{
    Calc c = new Calc();
    c.add(10, 12);
    System.out.println("End of Calc");
	}
}
