package day3;

 class Faculty{
	 void m1() {
		 int salary=3000;
		 System.out.println("salary:"+salary);
	 }
	 
 }
 class Bonus extends Faculty{
	 void m2() {
		 int bonus=2000;
		 System.out.println("bonus"+bonus);
	 }
	 
 }



public class Faculty_bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bonus bobj=new Bonus();
      bobj.m1();
      bobj.m2();
    Faculty aobj=new Bonus();
    aobj.m1();
   // obj.m2(); here ref of class faculty 
  
    
	}

}
