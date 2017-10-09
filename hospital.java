package hospital_management;

import java.io.IOException;
import java.util.Scanner;

public class hospital {

	Scanner scan = new Scanner(System.in);

	public String username() {
		System.out.print("Enter username .......");
		String name;
		name = scan.nextLine();
		return name;
	}

	public String password() {
		System.out.print("Enter password.......");
		String pass;
		pass = scan.nextLine();
		return pass;
	}

	public int drawer() {
		Scanner br = new Scanner(System.in);
		patientrec pr = new patientrec();
		doctorrec dr = new doctorrec();
		treatmentrec tr = new treatmentrec();
		System.out.println("\n\nWelcome!");
		System.out.println("\tMenu");
		System.out.println("1. Patient Information Management ");
		System.out.println("2. Doctor Information Management");
		System.out.println("3. Treatment Information Management");
		System.out.println("4. Quit");
		System.out.print("Enter your choice: ");
		int choice = 0;
		choice = br.nextInt();
		switch (choice) {
		case 1:

		{

			try {
				pr.pim();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
			break;
		case 2: {

			try {
				dr.dim();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
			break;
		case 3: {

			try {
				tr.tim();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
			break;
		case 4:
			System.out.println("Quit");
			System.exit(0);
		default:
			System.out.println("Wrong Choice!!");
		}

		return choice;

	}

	public static void main(String[] args) throws IOException {

		hospital hsp = new hospital();
		hsp.username();
		hsp.password();
		hsp.drawer();
	}
}
