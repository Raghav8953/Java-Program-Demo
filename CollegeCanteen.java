class CollegeCanteen 
{
     static String collegeCanteenName;
	 String studentName;
	 int mobileNumber;
	 String emailId;
	 String address;
	 String gender;
	 String password;
	 String orderId;




	void signUp(){

		System.out.println(" ======================= " +this.hashCode()+ " =========================== ");
		System.out.println(" Welcome to the "+collegeCanteenName);
		System.out.println(" Student name is "+studentName);
		System.out.println(" Student Mobile Number is "+mobileNumber);
        System.out.println(" Student Email ID is "+emailId);
		System.out.println(" Student Address is "+address);
		System.out.println(" Student Gender is "+gender);


	}
		void logIn(){

            System.out.println(" ======================= " +this.hashCode()+ " =========================== ");

			System.out.println(" Your Email ID is "+emailId);
			System.out.println(" Your Password is "+password);

		}
	void dashboard(){

		System.out.println(" ======================= "+ this.hashCode()+ " =========================== ");
		System.out.println(" Student name is "+studentName);
		System.out.println(" Student Mobile Number is "+mobileNumber);
        System.out.println(" Student Email ID is "+emailId);
		System.out.println(" Student Address is "+address);
		System.out.println(" Student Gender is "+gender);
		
		
	}
	void payments(){

		System.out.println(" ======================= " +this.hashCode()+ " =========================== ");
		System.out.println(" Your Payment has Done Successfully ");
		
	}
	
		void settings(){
			
		}
			
	void yourOrders(){
		System.out.println(" ======================= " +this.hashCode()+ " =========================== ");
		System.out.println(" Your Order has Placed Successfully ");
		System.out.println(" Your Order ID is .... " +orderId);



		
	}
	void shopStores(){
		
	}
	public static void main(String[] args) 
	{
		CollegeCanteen s1=new CollegeCanteen();
		CollegeCanteen s2=new CollegeCanteen();
		CollegeCanteen s3=new CollegeCanteen();
		CollegeCanteen s4=new CollegeCanteen();


		s1.collegeCanteenName=" Cafe Oasis ";
		s1.studentName= " Raghav ";
		s1.mobileNumber= 123456;
		s1.emailId= " raghav@gmail.com ";
		s1.address= " Rawatpur ";
		s1.gender= " Male ";


		s2.studentName= " Mahi ";
		s2.mobileNumber= 789456;
		s2.emailId= " mahi@gmail.com ";
		s2.address= " Ramadevi ";
		s2.gender= " Female ";



		s3.studentName= " Aryan ";
		s3.mobileNumber= 654321;
		s3.emailId= " aryan@gmail.com ";
		s3.address= " Chaubepur ";
		s3.gender= " Male ";


		s4.studentName= " Pari ";
		s4.mobileNumber= 1234;
		s4.emailId= " pari@gmail.com ";
		s4.address= " Barra Kanpur ";
		s4.gender= " Female ";

		s1.password= " raghav123 ";
		s2.password= " mahi123 ";
		s3.password= " aryan123 ";
		s4.password= " pari123 ";



		s1.orderId= " CO-001 ";
		s2.orderId= " CO-002 ";
		s3.orderId= " CO-003 ";
		s4.orderId= " CO-004 ";








		s1.signUp();
		s2.signUp();
		s3.signUp();
		s4.signUp();


		s1.logIn();
		s2.logIn();
		s3.logIn();
		s4.logIn();

		s1.dashboard();
		s2.dashboard();
		s3.dashboard();
		s4.dashboard();


		s1.payments();
		s2.payments();
		s3.payments();
		s4.payments();


		s1.yourOrders();
		s2.yourOrders();
		s3.yourOrders();
		s4.yourOrders();


	

        System.out.println(" ========================================================================================== ");

		            System.out.println("                      @@@@@@ Thankyou For Giving Your Precious Time To Us For Serving You @@@@@@ ");
		
		
	}
}
