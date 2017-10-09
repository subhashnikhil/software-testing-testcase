package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class treatmentrec_test {

	@Test
	public void test() {
	treatmentrec test =new treatmentrec();
	int choice= test.drawer();
	assertTrue(choice>0 && choice<=5);
	}

}
