package day3;
class Salary{
float gsal=0;
float sal=5000;

}
class Hra extends Salary{
	float hra=500;
}
class Da extends Hra{
	float da=300;
	
}
class Allowence extends Da{
	float allow=1000;
}


public class Multilevel_inheritence {
  public static void main(String[] args)
  {
	 Allowence obj=new Allowence();
	 obj.gsal=obj.allow+obj.da+obj.hra+obj.sal;
	 System.out.println("total sal:"+obj.gsal);
	  
  }
}
