import java.util.Scanner;

public class PrintTables {
	
	public static void table(int r)
	{
		for(int i=1;i<=10000;i++)
			System.out.println(r*i);
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Integer for which table is to be printed:");
    	int number = input.nextInt();
	    table(number);

	}

}
