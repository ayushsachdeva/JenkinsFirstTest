package Polymorphism;

public class Child extends Parent {
	
	public Child(int a, int b)
	{
		super(a,b);
		System.out.println("Child Constructor");
		System.out.println(a+" "+b);
	}

	public void A()
	{
		System.out.println("Method A in Child Class");
	}
	public void B()
	{
		System.out.println("Method B in Child Class");
	}
		
	}
