package Abstract_Sample;

public class AbstraSample2 extends AbstraSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstraSample2 as=new AbstraSample2();
		as.add(50,50);
		
	}
	public AbstraSample2()
	{
		super();
	}
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		  System.out.println("add:" + c);
	}

}
