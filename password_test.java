package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class password_test {

	@Test
	public void test() {
		hospital hsp=new hospital();
		String pass=hsp.password();
		assertEquals("testing",pass);
	
	}

}
