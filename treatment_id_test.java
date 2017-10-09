package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class treatment_id_test {

	@Test
	public void test() {
	treatmentrec test=new treatmentrec();
	int id=test.tid;
	assertTrue(id>=1&&id<20000);
	}

}
