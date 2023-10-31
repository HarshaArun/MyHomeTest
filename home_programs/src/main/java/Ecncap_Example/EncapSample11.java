package Ecncap_Example;

import java.util.Scanner;

public class EncapSample11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapSample es=new EncapSample();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		es.setter(s1, s2);
		
		es.getter();
		sc.close();
	}

}
