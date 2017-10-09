package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class patient_bldgrp_test {

	@Test
	public void test() {
	patientrec test=new patientrec();
	String bg=test.pbloodgroup;
	assertTrue((bg.equals("O+"))||(bg.equals("O-"))||(bg.equals("A+"))||(bg.equals("A-"))||(bg.equals("B+"))||(bg.equals("B-"))||(bg.equals("AB+"))||(bg.equals("AB-")));
	}

}
