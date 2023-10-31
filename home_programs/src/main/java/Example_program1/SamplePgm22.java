package Example_program1;

import java.util.Scanner;

public class SamplePgm22 extends SamplePgm1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamplePgm22 sp=new SamplePgm22();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		sp.add(a, b);
		sp.show();

	}

	@Override
	public void add(int n1, int n2) {
		// TODO Auto-generated method stub
		int sum=n1+n2;
		System.out.println("sum= "+ sum);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("this is abstract class");
	}

}
