class student 
{
	String name;
	int rollNumber;
	static String collegeName;
	String username;
	String password;
		void register(){
        System.out.println(" =============== "+this.hashCode()+" =============== ");
		System.out.println("Hi..." +name +" you are registered ");
        System.out.println("Your Name is " +name);
		System.out.println("Your College Name is " +collegeName);
		System.out.println("Your Roll no. is " +rollNumber);

		
		}
		
		void login(){
			
			System.out.println("  Your Username "+username);
			System.out.println(" Your Password "+password);



		
			
		}
		void logout(){
			System.out.println(" Click here for logout ");
			
		}
	public static void main(String[] args) 
	{
		student s1= new student();
		student s2= new student();
		student s3= new student();

		
		s1.name="xyz";
        s1.rollNumber= 11;
        s1.username="a";
        s1.password="123a";


		s2.name="Abc";
        s2.rollNumber= 12;
        s2.username="b";
        s2.password="456b";

		s3.name="ram";
		s3.rollNumber= 13;
        s3.username="c";
        s3.password="789c";

		s1.collegeName= "PSIT Kanpur";

		s1.register();
		s2.register();
		s3.register();
         
        s1.login();
		s2.login();
		s3.login();

	    s1.logout();
		s2.logout();
		s3.logout();



              System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ " +" THANKYOU FOR VISITING "+ " @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ");

	}
}
