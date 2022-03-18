package day1_1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num;
		int sum;
		int temp=0;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter  number that you want to check");
		num=sc.nextInt();
		int num2=num;
		while(num>0)
		{
		sum=num%10;
		temp=sum*sum*sum+temp;
		num=num/10;
		
			
		}
		if(temp==num2)
			System.out.println("given number is armstrong number");
		else 
			System.out.println("given number is not armstrong number");
		
		// TODO Auto-generated method stub

	}

}
