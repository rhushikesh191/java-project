package day4;

class Balance {
	private double balance;

	  
	void balance() {
		
		this.balance=12342;
	}
	  
	public double getbalance() {
		
		return balance;
	}
	void  setbalance(int amount) {
		
		balance=this.balance+amount;
		System.out.println("balance:"+balance);
		
	}
	
}


public class Encap {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
   Balance b1=new Balance ();
     b1.setbalance(20000);
	}

}
