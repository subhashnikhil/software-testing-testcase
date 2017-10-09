package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class patient_name_test {

	@Test
	public void test() {
	patientrec test=new patientrec();
	String name=test.pname;
	assertNotNull(name);
	}

}
