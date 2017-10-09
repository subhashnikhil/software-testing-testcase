package hospital_management;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ user_name_test.class,password_test.class,drawertest.class,patientrec_test.class,doctorrec_test.class,treatmentrec_test.class,
	
	patient_id_test.class,patient_name_test.class,
	   patient_age_test.class, patient_bg_ntnl_test.class,patient_bldgrp_test.class,
	   patient_g_ntnl_test.class, patient_gender_test.class,patient_phn_ntnl_test.class,
	   
	   doctor_id_test.class,doctor_name_test.class,doctor_age_test.class,
	   doctor_g_ntnl_test.class,doctor_gen_test.class, 
		 doctor_phn_ntnl_test.class, doctor_spec_ntnl_test.class, doctor_spec_test.class,
		 
		  treatment_id_test.class
		  })
public class AllTests {

}
