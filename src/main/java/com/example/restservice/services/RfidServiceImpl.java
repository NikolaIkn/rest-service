package com.example.restservice.services;

import com.example.restservice.domain.Rfid;
import com.example.restservice.repositories.RfidRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RfidServiceImpl implements RfidService {

    private final RfidRepository rfidRepository;

    public RfidServiceImpl(RfidRepository rfidRepository) {
        this.rfidRepository = rfidRepository;
    }

    @Override
    public Rfid findRfidById(Long id) {
        return rfidRepository.findById(id).get();
    }

    @Override
    public List<Rfid> findAllRfid() {
        return rfidRepository.findAll();
    }

    @Override
    public Rfid saveRfid(Rfid rfid) {
        return rfidRepository.save(rfid);
    }
}
