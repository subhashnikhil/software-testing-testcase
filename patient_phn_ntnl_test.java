package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class patient_phn_ntnl_test {

	@Test
	public void test() {
	patientrec test = new patientrec();
	String phn=test.pphonenumber;
	assertNotNull(phn);
	}

}
