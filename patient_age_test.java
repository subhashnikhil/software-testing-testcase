package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class patient_age_test {

	@Test
	public void test() {
	patientrec test=new patientrec();
	int age=test.page;
	assertTrue(age>=1 && age<120);
	}

}
