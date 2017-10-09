package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class doctorrec_test {

	@Test
	public void test() {
	doctorrec test =new doctorrec();
	int choice=test.drwer();
	assertTrue(choice>0 && choice<=5);
	}
}
