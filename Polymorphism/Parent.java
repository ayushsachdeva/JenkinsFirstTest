package Polymorphism;

public class Parent {
	
	 int a;
	 int b;
	public Parent(int a, int b)
	{
		System.out.println("Parent Constrctor");
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}

	public void A()
	{
		System.out.println("Method A in Parent Class");
	}

	public  void B()
	{
		System.out.println("Method B in Parent Class");
	}
}
