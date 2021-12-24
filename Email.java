package emailapp;
import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "abc.com";

	// Constructor to receive the first and last name
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email created: " + firstName + " " + lastName);

		// call a method asking for the department - return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		// call a method that returns a random password
		this.password = randomPass(defaultPasswordLength);
		System.out.println("Your password is : " + this.password);
		
		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is: " + email);
	}
	
	// Ask for department
	 private String setDepartment() {
		 System.out.print("New Worker: " + firstName + ". Department Codes:\n 1 for Sales \n 2 for Development\n 3 for Accounting\n 0 for None\n Enter the department\n");
		 Scanner in = new Scanner (System.in);
		int depChoice = in.nextInt();
		 if(depChoice == 1) {
			 return "sales";
		 } else if (depChoice == 2) {
			 return "development";
		 } else if(depChoice == 3) {
			 return "accounting";
		 } else {
			 return "";
		 }
	 }
	// Generate random password
	 private String randomPass(int length) {
		 String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*?";
		 char[] password = new char[length];
		 for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		 }
		 return new String(password);
	 }
	
	// Set mailbox capacity
	 public void setMailboxCapacity(int capacity) {
		 this.mailboxCapacity = capacity;
		 
	 }
	
	// Set alternate email
	 public void setAlternateEmail(String altEmail) {
		 this.alternateEmail = altEmail;
	 }
	
	// Change the password
	 public void changePassword(String password) {
		 this.password = password;
	 }
	 
	 public int getMailboxCapacity(){
		 return mailboxCapacity;
	 }
	 
	 public String getAlternateEmail() {
		 return alternateEmail;
	 }
	 
	 public String getPassword() {
		 return password;
	 }
	 
public String showInfo() {
	//name, email, mailbox capacity
	return "DISPLAY NAME: " + firstName + "" + lastName+
			"\nCOMPANY EMAIL: " + email +
			"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
}
	
	
}
