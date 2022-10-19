// 22:29 03-10-2022
class MovieTicket 
{
	String name;
	int mobileNumber;
	String slotDetails;
	int tickets;
	static String movieName;

	void register(){
		System.out.println(" ========================================== "+this.hashCode()+ " ================================================================ ");
	    System.out.println(" Hello "+name+ " You are registerd ");
		System.out.println(" Your name is "+name);
		System.out.println(" Your registered mobile number is "+mobileNumber);
		System.out.println(" Your slot for movie is "+slotDetails);
		System.out.println(" Your number of tickets are "+tickets);
		System.out.println(" Your Movie name is "+movieName);


	}

	void Confirm(){
		System.out.println("!!!!!!!!!!!!!!!!!!! "+this.hashCode()+ " !!!!!!!!!!!!!!!!!!!!!!!!!!!!! ");

		System.out.println(" Your Tickets Are Confirmed ");
	}
    
	void Payment(){

		System.out.println(" ******************* "+this.hashCode()+ " ***************************** ");

		System.out.println(" Payment Successfull ");
	}

	void CancleTickets(){
     
	    System.out.println(" $$$$$$$$$$$$$$$$$$$$ "+this.hashCode()+ " $$$$$$$$$$$$$$$$$$$$$$$$$$$ ");

		System.out.println(" Cancelling Tickets ");

	}

	public static void main(String[] args) 
	{
		MovieTicket p1= new MovieTicket();
        MovieTicket p2= new MovieTicket();
		MovieTicket p3= new MovieTicket();

		p1.name="Ram";
        p1.mobileNumber=123456;
		p1.slotDetails="12PM 04-10-2022";
		p1.tickets=02;
        p1.movieName="Interstaller";

		p2.name="Raghav";
        p2.mobileNumber=987654;
		p2.slotDetails="10AM 06-10-2022";
		p2.tickets=03;
         

		p3.name="Raghu";
        p3.mobileNumber=123456;
		p3.slotDetails="2PM 08-10-2022";
		p3.tickets=04;


        p1.register();
		p2.register();
		p3.register();

        p1.Confirm();
        p2.Confirm();
		p3.Confirm();


		p1.Payment();
		p2.Payment();
		p3.Payment();

		p1.CancleTickets();
		p2.CancleTickets();
		p3.CancleTickets();


	}
}
