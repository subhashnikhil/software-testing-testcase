package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class doctor_age_test {

	@Test
	public void test() {
	doctorrec test=new doctorrec();
	int age=test.dage;
	assertTrue(age>30&&age<60);
	}

}
