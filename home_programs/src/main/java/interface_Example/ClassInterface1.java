package interface_Example;

import java.util.Scanner;

public class ClassInterface1 implements InterfaceSample22{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceSample22 s1=new ClassInterface1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String a3=sc.nextLine();
		sc.close();
		s1.show(a3);
		s1.show1();
		System.out.println("abstract value " + s1.ss);
	}

	@Override
	public void show(String na) {
		// TODO Auto-generated method stub
		System.out.println("Name1: " + na);
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("Name2: Zumba");
	}

}
