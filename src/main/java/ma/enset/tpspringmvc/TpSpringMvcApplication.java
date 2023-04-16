package ma.enset.tpspringmvc;

import ma.enset.tpspringmvc.entities.Patient;
import ma.enset.tpspringmvc.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TpSpringMvcApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {

        SpringApplication.run(TpSpringMvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //patientRepository.save(new Patient(null,"Mohamed",new Date(),false,34));
        //patientRepository.save(new Patient(null,"Kamilia",new Date(),true,24));
        //patientRepository.save(new Patient(null,"Samia",new Date(),true,15));
        //patientRepository.save(new Patient(null,"Fouzia",new Date(),false,8));
    }
}
