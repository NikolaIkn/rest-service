package com.example.restservice.repositories;


import com.example.restservice.domain.Rfid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RfidRepository extends JpaRepository<Rfid, Long> {


}
