package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class patient_bg_ntnl_test {

	@Test
	public void test() {
	patientrec test=new patientrec();
	String bg=test.pbloodgroup;
	assertNotNull(bg);
	}

}
