package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class doctor_spec_ntnl_test {

	@Test
	public void test() {
	doctorrec test=new doctorrec();
	String spec=test.dspecial;
	assertNotNull(spec);
	}

}
