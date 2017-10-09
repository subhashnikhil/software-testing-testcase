package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class patientrec_test {

	@Test
	public void test() {
	patientrec test=new patientrec();
	int choice= test.drawer();
	assertTrue(choice>0 && choice<=5);
	}

}
