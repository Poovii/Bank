package mm;

public class MMSavingAcc extends SavingAcc {

	 private static final float MINIBAL = 500.0f;

   public  MMSavingAcc(int accNo,String accNm,float accBal,boolean isSalaried) {
       super(accNo, accNm, accBal, isSalaried);
       
   }
   //@override
   public void withdraw(float amt) {
      super.withdraw(amt);
        }
   
  @Override
	public String toString() {
		return  getAccNo() + " " + getAccNm() + " " +getAccBal();
	}
   
 public float getMINIBAL() {
	  return MINIBAL;
 }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   


}


