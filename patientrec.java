package hospital_management;

import java.io.*;
import java.util.Scanner;

public class patientrec {

	public static String pname, pgender, pbloodgroup, pphonenumber;
	public static int page, spid, pid, count = 0;
	public int q[] = new int[100];
	Scanner br = new Scanner(System.in);

	public void displayprecord() {
		System.out.println("\t #####Patient Details#####");
		System.out.print("I.D. Number:" + pid);
		System.out.print("\tName:" + pname);
		System.out.print("\tAge:" + page);
		System.out.print("\tGender:" + pgender);
		System.out.print("\tBlood Group:" + pbloodgroup);
		System.out.print("\tPhone Number:" + pphonenumber);
		System.out.println("\n");
	}

	public int drawer() {
		int a = 0, k, x, i = 0;
		boolean flag1 = true;
		while (flag1) {
			System.out.println("1. Write Record ");
			System.out.println("2. Update Record ");
			System.out.println("3. Search");
			System.out.println("4. Display Record");
			System.out.println("5. Back");
			System.out.print("Enter your choice: ");
			a = br.nextInt();
			switch (a) {
			case 1: // Creation of Patient file
					// Read data from Keyboard
				System.out.println("How many Patients?");
				x = br.nextInt();
				FileWriter fout1;
				try {
					fout1 = new FileWriter("patient.txt");
					for (k = 0; k < x; k++) {
						System.out.print("Enter Patient Name:");
						br.nextLine();
						pname = br.nextLine();
						System.out.print("Enter Phone Number:");
						pphonenumber = br.nextLine();
						System.out.print("Enter Age:");
						page = br.nextInt();
						System.out.print("Enter Gender:");
						br.nextLine();
						pgender = br.nextLine();
						System.out.print("Enter Bloodgroup:");
						pbloodgroup = br.nextLine();
						System.out.print("Enter I.D. Number:");
						pid = br.nextInt();
						q[i] = pid;
						i++;

						// Written to Patient file
						fout1.write(page + "  \n");
						fout1.write(pphonenumber + "  \n");
						fout1.write(pname + "  \n");
						fout1.write(pgender + "  \n");
						fout1.write(pbloodgroup + "  \n");
						fout1.write(pid + "  \n");
					}
					fout1.close();
					System.out.println("\nFile is created\n");
					break;

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			case 2: // Updation of Patient file
				count++;
				// Read data from Keyboard
				System.out.println("How many Patients?");
				x = br.nextInt();
				FileWriter fout2;
				try {
					fout2 = new FileWriter("patient.txt", true);
					for (k = 0; k < x; k++) {
						System.out.print("Enter Patient Name:");
						br.nextLine();
						pname = br.nextLine();
						System.out.print("Enter Phone Number:");
						pphonenumber = br.nextLine();
						System.out.print("Enter Age:");
						page = br.nextInt();
						System.out.print("Enter Gender:");
						br.nextLine();
						pgender = br.nextLine();
						System.out.print("Enter Bloodgroup:");
						pbloodgroup = br.nextLine();
						System.out.print("Enter I.D. Number:");
						pid = br.nextInt();
						q[i] = pid;
						i++;

						// Written to Patient file
						fout2.write(page + "  \n");
						fout2.write(pphonenumber + "  \n");
						fout2.write(pname + "  \n");
						fout2.write(pgender + "  \n");
						fout2.write(pbloodgroup + "  \n");
						fout2.write(pid + "  \n");
					}
					fout2.close();
					System.out.println("\nFile is updated\n");
					break;

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			case 3:
				System.out.print("Enter Patient I.D. Number:");
				spid = br.nextInt();
			case 4:
				FileReader fin = null;
				try {
					fin = new FileReader("patient.txt");
					Scanner sc = new Scanner(fin);
					while (sc.hasNextInt()) {
						// Read data from file
						page = sc.nextInt();
						pphonenumber = sc.next();
						pname = sc.next();
						pgender = sc.next();
						pbloodgroup = sc.next();
						pid = sc.nextInt();
						q[i] = pid;
						if (a == 4)
							displayprecord();
						else if (a == 3) {
							if (spid == q[i])
								displayprecord();
							else
								System.out.println("Record not found");
						}
					}
					for (int r = 0; r < count; r++) {
						while (sc.hasNextInt()) {
							// Read data from file
							page = sc.nextInt();
							pphonenumber = sc.next();
							pname = sc.next();
							pgender = sc.next();
							pbloodgroup = sc.next();
							pid = sc.nextInt();
							q[i] = pid;
							if (a == 4)
								displayprecord();
							else if (a == 3) {
								if (spid == q[i])
									displayprecord();
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5: {
				hospital hs = new hospital();
				hs.drawer();
			}
				break;
			default:
				flag1 = false;
				break;
			}
		}
		return a;
	}

	public void pim() throws IOException {
		patientrec pa = new patientrec();
		pa.drawer();
	}

}