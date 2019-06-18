package com.example.restservice.bootstrap;


import com.example.restservice.repositories.RfidRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final RfidRepository rfidRepository;

    public BootStrapData(RfidRepository rfidRepository) {
        this.rfidRepository = rfidRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Rfid Data");

        /*Rfid r1 = new Rfid();
        r1.setZemlja("Srbija");
        r1.setIme("Hleb");
        r1.setDatum("06/06/2019");
        r1.setLat(46.54654646);
        r1.setLon(2.465465);
        rfidRepository.save(r1);
*/
        System.out.println("Rfid saved:" +rfidRepository.count());
    }
}
