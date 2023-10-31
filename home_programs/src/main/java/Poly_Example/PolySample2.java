package Poly_Example;

public class PolySample2 extends PolySample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolySample2 ps2=new PolySample2();
		ps2.add();
		ps2.sum(100,500);
		ps2.sum("aaa");
	}
	public void add()
	{
		super.add();
		int a=50,b=50;
		int s2=a+b;
		System.out.println("Sum2: " + s2);
	}

}
