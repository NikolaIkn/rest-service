package com.example.restservice.services;

import com.example.restservice.domain.Rfid;

import java.util.List;

public interface RfidService {
    Rfid findRfidById(Long id);

    List<Rfid> findAllRfid();

    Rfid saveRfid(Rfid rfid);
}
