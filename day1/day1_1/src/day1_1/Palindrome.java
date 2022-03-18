package day1_1;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int number;
		int sum=0;
		
	
		
		Scanner sn=new Scanner(System.in);
        System.out.println("enter a number");
        number=sn.nextInt();
        int rev=number;
        while(number!=0)
        {
        	sum=(sum*10)+(number%10);
        	number=number/10;
        	
        }
      if(rev==sum)  
          System.out.println("number is palindrome number");
      else
    	  System.out.println("number is not palindrome number");
		// TODO Auto-generated method stub

	}

}
