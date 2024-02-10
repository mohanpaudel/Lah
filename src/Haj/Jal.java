package Haj;

import java.util.Scanner;

public class Jal {
	public static void main(String[] args) {

		System.out.println("God is great.");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your firstname.");
			String firstname = sc.nextLine();
			System.out.println("Enter your lastname.");
			String lastname = sc.nextLine();
			String fullname = "Fullnamae is " + firstname + " " + lastname + ".";
			System.out.println(fullname);
			// String fullname=sc.nextLine();
			System.out.println("Do you want to continue?(yes/no)");
			String doContinue = sc.nextLine();
			if (doContinue.equalsIgnoreCase("yes/no")) {
				continue;
			} else if (doContinue.equalsIgnoreCase("no")) {
				System.out.println("You are logout");
				break;
			}

		}

	}
}
