package day4;
 class Sbi {
	 
	 public void fundtransfer(int sender_accountno,int reciver_accountno,int amount) {
		System.out.println("sender account no:"+sender_accountno);
		System.out.println("reciver accountno:"+reciver_accountno);
		System.out.println("amount::"+amount);
		 
	 }
	 
	 public void fundtransfer(int sender_accountno,double amount ) {
		 System.out.println("senderacountno"+sender_accountno);
		 System.out.println("amount"+amount);
		 
	 }
	 public void fundtransfer(double DDNO,  double amt) {
		 System.out.println("sender acc no."+DDNO);
			System.out.println("transfr amount."+amt);
			
		 
	 }
	 
}


public class Mehod_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi obj=new Sbi();
		obj.fundtransfer(10231,10908,5000);

	}

}
/*
class SBITBank{
	//by using chequeBanking;
//netbanking
//DD banking
public void fundtransfer(int senderAccno, int receiverAccNo, double amt) {
	
	System.out.println("user transfer amount using netbanking");
	System.out.println("sender acc no."+senderAccno);
	System.out.println("reciever acc no."+receiverAccNo);
	System.out.println("transfr amount."+amt);
	System.out.println("fund transfer successful.....");
}
public void fundtransfer(int chequeNO,  double amt) {
	
	System.out.println("user transfer amount using cheque");
	System.out.println("sender acc no."+chequeNO);
	
	System.out.println("transfr amount."+amt);
	System.out.println("fund transfer successful....");
	
}
public void fundtransfer(int DDNO,  double amt, LocalDate ld) {
	
	System.out.println("user transfer amount using cheque");
	System.out.println("sender acc no."+DDNO);
	
	System.out.println("transfr amount."+amt);
	System.out.println("Date: "+ ld.now());
	System.out.println("transfr amount."+amt);
	
	System.out.println("fund transfer successful....");
}
}
public class FundTransferDemo {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	SBITBank sbiBank = new SBITBank();
	sbiBank.fundtransfer(100126, 67000.90, LocalDate.now());
}

}*/