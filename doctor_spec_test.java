package hospital_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class doctor_spec_test {

	@Test
	public void test() {
	doctorrec test=new doctorrec();
	String spec=test.dspecial;
	assertTrue(spec.equals("pulmonologist")||spec.equals("audiologist")||spec.equals("allergist")||	
			spec.equals("anesthesiologist")||spec.equals("cardiologist")||spec.equals("dentist")||
			spec.equals("dermatologist")||spec.equals("endocrinologist")||spec.equals("epidemiologist")||spec.equals("gynecologist")||
			spec.equals("immunologist")||spec.equals("microbiologist")||spec.equals("neonatologist")||spec.equals("neurologist")||
			spec.equals("neurosurgeon")||spec.equals("obstetrician")||spec.equals("oncologist")||spec.equals("orthopedicsurgeon")||
			spec.equals("ENT")||spec.equals("pediatrician")||spec.equals("physiologist")||spec.equals("podiatrist")||
			spec.equals("psychiatrist")||spec.equals("radiologist")||spec.equals("rheumatologist")||spec.equals("urologist"));
	}

}
