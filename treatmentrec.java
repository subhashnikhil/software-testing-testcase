package hospital_management;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class treatmentrec {
	public static String dateofjoining, treatment, diagnoseddisease, prescription, dischargedate, result;
	public static int tid, stid, spid, sdid, t1, t2;
	boolean f = true;
	String str3 = "";
	Scanner br = new Scanner(System.in);
	patientrec p1 = new patientrec();
	doctorrec d1 = new doctorrec();

	void displaytrecord() throws IOException {
		System.out.print("Treament I.D. Number:" + tid);
		System.out.print("Date of Joining:" + dateofjoining);
		System.out.print("Patient's I.D. Number:" + spid);
		System.out.print("Doctor's I.D. Number:" + sdid);
		System.out.print("Treament:" + treatment);
		System.out.print("Disease Diagnosed with:" + diagnoseddisease);
		System.out.print("Medicines Prescription:" + prescription);
		System.out.print("Date of Discharge:" + dischargedate);
		System.out.print("RESULT:" + result);
		System.out.println("\n");
	}

	public int drawer() {
		int c = 0, m, z;
		boolean flag3 = true;

		while (flag3) {
			System.out.println("1. Write Record ");
			System.out.println("2. Update Record ");
			System.out.println("3. Search");
			System.out.println("4. Display Record");
			System.out.println("5. Back");
			System.out.print("Enter your choice: ");
			c = br.nextInt();
			switch (c) {
			case 1:
				FileWriter fout3;
				try {
					fout3 = new FileWriter("treatment.txt");
					System.out.print("How many Treatment Records? ");
					z = br.nextInt();
					for (m = 0; m < z; m++) {
						System.out.print("Enter Date of Joining:");
						br.nextLine();
						dateofjoining = br.nextLine();
						System.out.print("Enter Patient's I.D. Number:");
						t1 = br.nextInt();
						int k = 0;
						if (p1.q.length != 0) {
							if (t1 == p1.q[k])
								System.out.println("Patient I.D number not found");
							else {
								t1 = 1;
								spid = t1;
								k++;
								System.out.println("Patient I.D number found");
							}
						}
						System.out.print("Enter Doctor's I.D. Number:");
						t2 = br.nextInt();
						int l = 0;
						if (d1.r.length != 0) {
							if (d1.r[l] == t2)
								System.out.println("Doctor I.D number not found");
							else {
								t2 = 2;
								l++;
								sdid = t2;
								System.out.println("Doctor I.D number found");
							}
						}
						System.out.print("Enter Treament:");
						br.nextLine();
						treatment = br.nextLine();
						System.out.print("Enter Disease Diagnosed with:");
						diagnoseddisease = br.nextLine();
						System.out.print("Enter Medicines Prescribed:");
						prescription = br.nextLine();
						System.out.print("Enter Date of Discharge:");
						dischargedate = br.nextLine();
						System.out.print("Enter RESULT:");
						result = br.nextLine();
						System.out.print("Enter Treatment I.D. Number:");
						tid = br.nextInt();
						// Write to file.
						fout3.write(tid + "  \n");
						fout3.write(dateofjoining + "  \n");
						fout3.write(treatment + "  \n");
						fout3.write(diagnoseddisease + "  \n");
						fout3.write(prescription + "  \n");
						fout3.write(dischargedate + "  \n");
						fout3.write(result + "  \n");
						fout3.write(sdid + "  \n\n");

					}
					fout3.write("EOF");
					fout3.close();
					System.out.println("File is created");

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				FileWriter fout4;
				try {
					fout4 = new FileWriter("treatment.txt");
					System.out.print("How many Treatment Records? ");
					z = br.nextInt();
					for (m = 0; m < z; m++) {
						System.out.print("Enter Date of Joining:");
						br.nextLine();
						dateofjoining = br.nextLine();
						System.out.print("Enter Patient's I.D. Number:");
						t1 = br.nextInt();
						int k = 0;
						if (p1.q.length != 0) {
							if (t1 == p1.q[k])
								System.out.println("Patient I.D number not found");
							else {
								t1 = 1;
								spid = t1;
								k++;
								System.out.println("Patient I.D number found");
							}
						}
						System.out.print("Enter Doctor's I.D. Number:");
						t2 = br.nextInt();
						int l = 0;
						if (d1.r.length != 0) {
							if (d1.r[l] == t2)
								System.out.println("Doctor I.D number not found");
							else {
								t2 = 2;
								l++;
								sdid = t2;
								System.out.println("Doctor I.D number found");
							}
						}
						System.out.print("Enter Treament:");
						br.nextLine();
						treatment = br.nextLine();
						System.out.print("Enter Disease Diagnosed with:");
						diagnoseddisease = br.nextLine();
						System.out.print("Enter Medicines Prescribed:");
						prescription = br.nextLine();
						System.out.print("Enter Date of Discharge:");
						dischargedate = br.nextLine();
						System.out.print("Enter RESULT:");
						result = br.nextLine();
						System.out.print("Enter Treatment I.D. Number:");
						tid = br.nextInt();
						// Write to file.
						fout4.write(tid + "  \n");
						fout4.write(dateofjoining + "  \n");
						fout4.write(treatment + "  \n");
						fout4.write(diagnoseddisease + "  \n");
						fout4.write(prescription + "  \n");
						fout4.write(dischargedate + "  \n");
						fout4.write(result + "  \n");
						fout4.write(sdid + "  \n\n");

					}
					fout4.close();
					System.out.println("File is created");

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.print("Enter Treatment I.D. Number : ");
				stid = br.nextInt();
			case 4:
				FileReader fin;
				try {
					fin = new FileReader("treatment.txt");
					Scanner sc = new Scanner(fin);
					while (sc.hasNextInt()) {
						// Read data from file
						tid = sc.nextInt();
						dateofjoining = sc.next();
						treatment = sc.next();
						diagnoseddisease = sc.next();
						prescription = sc.next();
						dischargedate = sc.next();
						result = sc.next();
						spid = sc.nextInt();

						if (c == 4) {
								try {
									displaytrecord();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						}
						if (c == 3) {

							if (spid == p1.pid && sdid == d1.did && stid == tid) {
								try {
									displaytrecord();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

							}
						}
					}

					try {
						fin.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} catch (FileNotFoundException e) {
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
				flag3 = false;
				break;

			}
		}
		return c;
	}

	public void tim() throws IOException {
		treatmentrec tm = new treatmentrec();
		tm.drawer();
	}

}
