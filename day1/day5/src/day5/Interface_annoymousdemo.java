package day5;

interface Age{
	
	int x=90;
	 public void getage();
	
}


public class Interface_annoymousdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Age age=new Age() {
	  
	 public void getage() {
		 System.out.println("age:"+x);
	  }
  };

age.getage();
}
}

/*
 * interface Age{
int x = 90;
void getAge();
}
public class InterfaceAnnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age  age = new Age() {
		public void getAge() {
			System.out.println("age is:"+x);
		}
	};
	age.getAge();
}
}*/
