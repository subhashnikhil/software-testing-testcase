package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class patient_g_ntnl_test {

	@Test
	public void test() {
	patientrec test=new patientrec();
	String gen=test.pgender;
	assertNotNull(gen);
	}

}
