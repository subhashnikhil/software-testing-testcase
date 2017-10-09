package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class doctor_name_test {

	@Test
	public void test() {
	doctorrec test=new doctorrec();
	String name=test.dname;
	assertNotNull(name);
	}

}
