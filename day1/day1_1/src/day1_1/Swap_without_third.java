package day1_1;

import java.util.Scanner;

public class Swap_without_third {

	public static void main(String[] args) {
    
		int a,b;
		Scanner sn = new Scanner (System.in); 
		System.out.println("enter a fist value");
		a=sn.nextInt();
		System.out.println("enter a second value");
		b=sn.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap values are:"+ a +" "+ b );
		

	}

}
