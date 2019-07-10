package com.example.restservice.controller;


import com.example.restservice.domain.Rfid;
import com.example.restservice.services.RfidService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(RfidController.BASE_URL)
public class RfidController {

    public static final String BASE_URL= "/api/rfid";

    private final RfidService rfidService;


    public RfidController(RfidService rfidService) {
        this.rfidService = rfidService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    List<Rfid> findAllRfid(){
        return rfidService.findAllRfid();
    }

    @GetMapping("/id")
    public Rfid getRfidById(@PathVariable Long id){
        return rfidService.findRfidById(id);
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Rfid saveRfid(@RequestBody Rfid rfid){
        return rfidService.saveRfid(rfid);
    }
}
