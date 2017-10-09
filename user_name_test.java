package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class user_name_test {

	@Test
	public void test() {
		hospital hsp=new hospital();
		String user=hsp.username();
		assertEquals("admin",user);

	}

}
