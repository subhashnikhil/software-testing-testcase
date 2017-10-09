package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class doctor_id_test {

	@Test
	public void test() {
	doctorrec test=new doctorrec();
	int id=test.did;
	assertTrue(id>1&&id<100);
	
	}

}
