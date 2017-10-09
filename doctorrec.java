package hospital_management;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class doctorrec {

	public static String dname, dgender, dspecial, dphonenumber;
	public static int dage, sdid, did, count = 0;
	public int r[] = new int[100];
	Scanner br = new Scanner(System.in);

	public int drwer() {
		int b = 0, l, y;
		boolean flag2 = true;
		while (flag2) {
			System.out.println("1. Write Record ");
			System.out.println("2. Update Record ");
			System.out.println("3. Search");
			System.out.println("4. Display Record");
			System.out.println("5. Back");
			System.out.print("Enter your choice: ");
			b = br.nextInt();
			switch (b) {
			case 1: // Creation of Doctor file
				System.out.println("How many Doctors?\t");
				y = br.nextInt();
				FileWriter fout1 = null;
				try {
					fout1 = new FileWriter("doctor.txt");
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				for (l = 0; l < y; l++) {
					System.out.print("Enter Doctor Name:");
					br.nextLine();
					dname = br.nextLine();
					System.out.print("Enter Phone Number:");
					dphonenumber = br.nextLine();
					System.out.print("Enter Age:");
					dage = br.nextInt();
					System.out.print("Enter Gender:");
					br.nextLine();
					dgender = br.nextLine();
					System.out.print("Enter Specialisation:");
					dspecial = br.nextLine();
					System.out.print("Enter I.D. Number:");
					did = br.nextInt();

					// Written to Doctor file
					try {
						fout1.write(dage + "  \n");
						fout1.write(dphonenumber + "  \n");
						fout1.write(dname + "  \n");
						fout1.write(dgender + "  \n");
						fout1.write(dspecial + "  \n");
						fout1.write(did + "  \n\n");
						fout1.close();
						System.out.println("\nFile is created\n");

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case 2: // Updation of Doctor file
				count++;
				System.out.println("How many Doctors?\t");
				y = br.nextInt();
				FileWriter fout2;
				try {
					fout2 = new FileWriter("doctor.txt", true);
					for (l = 0; l < y; l++) {
						System.out.print("Enter Doctor Name:");
						br.nextLine();
						dname = br.nextLine();
						System.out.print("Enter Phone Number:");
						dphonenumber = br.nextLine();
						System.out.print("Enter Age:");
						dage = br.nextInt();
						System.out.print("Enter Gender:");
						br.nextLine();
						dgender = br.nextLine();
						System.out.print("Enter Specialisation:");
						dspecial = br.nextLine();
						System.out.print("Enter I.D. Number:");
						did = br.nextInt();

						// Written to Doctor file
						fout2.write(dage + "  \n");
						fout2.write(dphonenumber + "  \n");
						fout2.write(dname + "  \n");
						fout2.write(dgender + "  \n");
						fout2.write(dspecial + "  \n");
						fout2.write(did + "  \n\n");
					}
					fout2.close();
					System.out.println("\nFile is updated\n");
					break;
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

			case 3:
				System.out.print("Enter Doctor I.D. Number:");
				sdid = br.nextInt();
			case 4:
				FileReader fin = null;
				try {
					fin = new FileReader("doctor.txt");
					Scanner sc = new Scanner(fin);
					while (sc.hasNextInt()) {
						// Read data from file
						dage = sc.nextInt();
						dphonenumber = sc.next();
						dname = sc.next();
						dgender = sc.next();
						dspecial = sc.next();
						did = sc.nextInt();
						int i = 0;
						r[i] = did;
						i++;
						if (b == 4)
							displaydrecord();
						else if (b == 3) {
							if (sdid == did)
								displaydrecord();
							else
								System.out.println("Record not found");
						}
					}
					for (int o = 0; o < count; o++) {
						while (sc.hasNextInt()) {
							// Read data from file
							dage = sc.nextInt();
							dphonenumber = sc.next();
							dname = sc.next();
							dgender = sc.next();
							dspecial = sc.next();
							did = sc.nextInt();
							int i = 0;
							r[i] = did;
							i++;
							if (b == 4)
								displaydrecord();
							else if (b == 3) {
								if (sdid == did)
									displaydrecord();
								else
									System.out.println("Record not found");
							}
						}
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 5: {
				hospital hs = new hospital();
				hs.drawer();
			}
				break;
			default:
				flag2 = false;
				break;
			}
		}
		return b;

	}

	public void displaydrecord() {
		System.out.println("\t #####Doctor Details#####");
		System.out.print("I.D. Number:" + did);
		System.out.print("\tName:" + dname);
		System.out.print("\tAge:" + dage);
		System.out.print("\tGender:" + dgender);
		System.out.print("\tSpecialization:" + dspecial);
		System.out.print("\tPhone Number:" + dphonenumber);
		System.out.println("\n");

	}

	public void dim() throws IOException {

		doctorrec dc = new doctorrec();
		dc.drwer();
	}
}
