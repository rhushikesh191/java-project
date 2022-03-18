package day3;
 

class A{
	
	void m1()
	{
		System.out.println("i am from class A method m1");
	}
	
}
 class B extends A{
	 
	 void m2() {
		 System.out.println("i am from class B method m2");
	 }
	 void m3() {
		 System.out.println(" i am from class B method m3");
	 }
 }



public class Single_levelinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B ob=new B();
     ob.m1();
     ob.m2();
     ob.m3();
     
     A oa=new B();//ref of class A 
     oa.m1();
    // oa.m2();//here we can not call method of class B
     //ob.m3();
     
      
	}

}
