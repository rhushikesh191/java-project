package day3;
class Loan_1{
	int tenuar;
	float interest_rate;
	String account_number;
	
	 public double CalculateEmi(double principle){
		 double simpleinterest=(principle*interest_rate*tenuar)/100;
		 double emi=(principle*interest_rate*tenuar)/tenuar;
		 return emi;
	 }
}

 class Homeloan extends Loan_1 {
	 public Homeloan() {
	 tenuar=10;
	 interest_rate=10.7f;
	 }
 }





public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Homeloan homeloan=new Homeloan();
		double amount=homeloan.CalculateEmi(2000000);
		System.out.println("Home Loan emi per Year:"+amount);
	}

}
