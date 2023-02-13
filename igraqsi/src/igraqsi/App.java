package igraqsi;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input your password.");
		String password = s.nextLine();
		
		while(true) {
			if(passwordCheck(password)) {
				System.out.println("Successfully created a password!");
				break;
			} else {
				System.out.println("Password must contain atleast 8 characters, 1 letter and 1 number and 1 special symbol! Try again!");
				password = s.nextLine();
			}
		}
		
	}
	
	static boolean passwordCheck(String password) {
		if(password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[A-Za-z\\d$&+,:;=?@#|'<>.-^*()%!]{8,}$"))
			return true;
		return false;
	}

}
