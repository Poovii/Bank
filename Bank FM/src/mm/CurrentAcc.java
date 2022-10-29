package mm;


public abstract class CurrentAcc extends BankAcc {
	  
	 private  final float creditLimit;
	    public CurrentAcc(int accNo,String accNm,float accBal,Float creditLimit ) {
	    	 super(accNo,accNm,accBal);
	        this.creditLimit = creditLimit;
	    
	    }
	  

	    
	   //@override
	   public void withdraw(float amt) {
		   System.out.println(getAccBal());
		   try {
	    if(getAccBal()-amt>creditLimit){
	    	setAccBal(getAccBal()-amt);
	   
	 
	  
	       System.out.println(" withdraw is successfully...."); 
	       System.out.println("-------------------------------");
	     //  System.out.println("Your accBal is:");
	    
	   }
	   else{
	 
		   throw new InvalidFundException();
	   }
		   }
	    catch(Exception e) {
	    	System.out.println(e);
	    	
	    }
		   }
		   
	   

	  
	
	//@override
	   public String toString(){
	    
	    return  getAccNo() + " " + getAccNm() + " " +getAccBal();
	   }
}

	

	    


	

