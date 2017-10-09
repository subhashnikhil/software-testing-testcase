package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class doctor_g_ntnl_test {

	@Test
	public void test() {
doctorrec test=new doctorrec();
String g=test.dgender;
assertNotNull(g);
	}

}
