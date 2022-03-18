package day3;

abstract class Abs{
abstract void m1();
abstract void m2();

}

class Bsc extends Abs{
 
	void m1() {
		System.out.println("i a from m1 method");
		
	}
	
	void m2() {
		System.out.println("i am from method m2");
	}
}
public class Abstrctdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Abs obj=new Bsc();
    obj.m1();
    obj.m2();
 
     
	}

}
