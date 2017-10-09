package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class patient_id_test {

	@Test
	public void test() {
patientrec test=new patientrec();
int id=test.pid;
assertTrue(id>=1 && id<=10000);
	}

}
