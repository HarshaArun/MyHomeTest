package Ecncap_Example;

public class EncapSample {
	private int a,b;
		public void setter(int a,int b)
		{
			this.a=a;
			this.b=b;
			
		}
		
		public void getter()
		{
			this.add();
		}
		
		public void add()
		{
			int sum= a+b;
			System.out.println("Sum: " + sum);
		}
}