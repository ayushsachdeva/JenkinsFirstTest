
public class ExceptionHandling {

	
	public static void main(String[] args) {
		System.out.println("Before try Block");

		try{
			System.out.println("Beggining");
			int div=10/0;
			System.out.println(div);
			System.out.println("Ending");
		}
		catch(Exception e)
		{
			System.out.println("Error Occurred");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("After try catch block");
	}

}
