package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class drawertest {

	@Test
	public void test() {
		hospital hsp=new hospital();
		int choice=hsp.drawer();
		assertTrue(choice >0 && choice <=4);

	}

}
