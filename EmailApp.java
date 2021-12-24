package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		//object interaction
		Email em1 = new Email("John", "Smith");
		
		//em1.changePassword("ABC");
		//em1.setMailboxCapacity(0);
		//em1.setAlternateEmail("js@gmail.com");
		//System.out.println(em1.getAlternateEmail());
		
		System.out.println(em1.showInfo());
		
		
	}

}
