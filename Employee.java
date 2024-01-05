package Proejct;

import java.util.Scanner;

public class Employee {

	String name, password, mentor;
	int leave, avaliableLeave, requestl;
	Scanner scs = new Scanner(System.in);

	public Employee(String scanname, String scanpassword, int leave, int avaliableLeave, int requestedleave, String ment) {
		this.name = scanname;
		this.password = scanpassword;
		this.leave = leave;
		this.avaliableLeave = avaliableLeave;
		this.requestl = requestedleave;
		this.mentor = ment;

	}

	public Employee() {
	}

	// Displays available leaves
	public void viewleave() {

		System.out.println("Your free leaves are: " + GetleaveRE());
	}

	// method for requesting leave
	public void reqleave(int request) {

		// it checks if requested no. of leaves are available or not
		if (request > GetleaveRE()) {
			System.out.println("You don't have sufficient free leaves\n");
		} else {
			System.out.println("Requested for " + request + "days");
			setreq(request);

		}

	}

	// set the value of total leaves of regular employee
	protected void setreq(int request) {
		this.requestl = request;
	}

	// returns name of regular employee
	protected String GetnameRE() {
		return this.name;
	}

	// returns password of regular employee
	protected String GetpassRE() {
		return this.password;
	}

	// returns remaining leaves of regular employee
	protected int GetleaveRE() {
		return this.leave;
	}

	// returns used leaves of regular employee
	protected int GetusedleaveRE() {
		return this.avaliableLeave;
	}

	// setting the value of used leaves of regular employee
	protected void setusedleaveRE(int used) {
		this.avaliableLeave = used;
	}

	// returns no. of requesting leave
	protected int GETrequestedleaveRE() {
		return this.requestl;
	}

	// updating the value of total leaves of regular employee
	protected void updateleave(int update) {
		this.leave = update;
	}

	// returns the mentor name of regular employee
	protected String GETmentor() {
		return this.mentor;
	}

}