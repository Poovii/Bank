package mm;


	public abstract class BankAcc {

		 private int accNo;
		   private String accNm;
		    private float accBal;

		    
		    public int getAccNo() {
		     
		      return accNo;
		    }
		    public String getAccNm() {
		      
		       return accNm;
		        
		    }
		    public float getAccBal() {
		        return accBal;
		    	
		    }
		   public void setAccBal(float balance){
		       // System.out.println("Your accBalance is "+accBal);     
		     }
		     
		 
		   public BankAcc(int accNo,String accNm,float accBal){
		            super();
		            this.accNo = accNo;
		            this.accNm = accNm;
		            this.accBal = accBal;
		    
		        }
		  
		       

		    public abstract void  withdraw(float amt);
		      
		    	  public void deposit(float amt) {
		  	        accBal+=amt;
		  	       System.out.println("amount:"+amt);
		  	       System.out.println("deposited succssfully.....");
		  	       System.out.println("----------------------------");
		  	    }
		         
		        
		       // @override
		      public String toString()
		      { 
		        return  getAccNo() + " " + getAccNm() + " " +getAccBal();
		 
		
		}

	}
