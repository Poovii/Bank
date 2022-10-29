package mm;

public abstract class SavingAcc extends BankAcc {

	private boolean isSalaried;
	  
	    private static final float MINBAL = 500.0f;
	
	    
	    public SavingAcc(int accNo,String accNm,float accBal,boolean isSalaried ) {
	        super(accNo,accNm,accBal);
	        
	        this.isSalaried=isSalaried;
	     }
	    
	    public void getisSalaried() {
	     System.out.println(isSalaried);
         }
	   
	    public void withdraw(float amt){
	    	 System.out.println(getAccBal());
	    	 
	    		 
	    	 try {
	     
	      if(getAccBal()-amt>=MINBAL)
	      {
	         setAccBal(getAccBal()-amt);
	         System.out.println("amount:"+amt);
	        
	         System.out.println("withdraw is successfully...");
	         System.out.println("----------------------------");
	         System.out.println("Your accBal is:"+getAccBal());
	      }
	      else{
	       
	    	  throw new InvalidFundException();
	      }
	   }
	    	 catch(Exception e) {
	    		 System.out.println(e);
	    	 }
	    }
		public static float getMINBAL() {
			// TODO Auto-generated method stub
			return MINBAL;
		}

	 public String toString() {
	        return getAccNo() + " " + getAccNm() + " " +getAccBal();
	         
	     }
	   
	    

	       
	    
	}

	


  