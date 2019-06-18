
public class testing {
	
	static int a;
	public void main1() {
		a=1;
		System.out.println(a);
		main2();
	}
		public void main2()
		{
			a=2;
			System.out.println(a);
			
		}
        public static void main(String[] args) {
        	testing t = new testing();
        	
        	t.main1();
        	t.main2();
        
		}
}


