package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class doctor_gen_test {

	@Test
	public void test() {
	doctorrec test=new doctorrec();
	String gen=test.dgender;
	assertTrue((gen.equals("male"))||(gen.equals("female"))||(gen.equals("others")));
	}

}
