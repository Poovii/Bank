package mm;
import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		
		
		System.out.println("This is MONEY MONEY BANK!!!........");
		System.out.println("-----------------------------------------------");
		System.out.println("\n");
		
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice:");
		
		n=sc.nextInt();
		switch (n) {
		case 1:
				System.out.println("You choosed SavingAcc");
			    System.out.println("-----------------------------");
			
				MMSavingAcc s1=new MMSavingAcc(8900,"POOVI",5000.0f,true);
		        System.out.println(s1);
	
		        s1.deposit(500.0f);
	            System.out.println(s1);
	            System.out.println("-----------------------------");
	          
	            s1.withdraw(100.0f);
	            System.out.println(s1);
	          
	          
	            break;
		case 2:
			    System.out.println("You choosed CurrentAcc");
			    System.out.println("-----------------------------");
			
		        MMCurrentAcc c1=new MMCurrentAcc(123,"poovi",3000.0f,1000.0f);
	         	System.out.println(c1);
	
		
		
	
		        c1.deposit(1000.0f);
	        	System.out.println(c1);
	        	System.out.println("-----------------------------");
		          
		       
		        c1.withdraw(500.0f);
	        	System.out.println(c1);
	        	
	        	break;
	default:
		
		        System.out.println("You choosed  incorrcect Number,please enter valid number");
	        	System.out.println("-----------------------------------------------------");
		
		
		
		

	}

}
}