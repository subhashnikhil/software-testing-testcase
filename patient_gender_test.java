package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class patient_gender_test {

	@Test
	public void test() {
	patientrec test=new patientrec();
	String gen=test.pgender;
	assertTrue((gen.equals("male"))||(gen.equals("female"))||(gen.equals("others")));
	}

}
