package com.vk.spring.boot.controller;

import com.vk.spring.boot.dto.InputRequestVo;
import com.vk.spring.boot.dto.ResponseInformationVo;
import com.vk.spring.boot.service.TicketingService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketingController {
    private static final Logger LOG = LoggerFactory.getLogger(TicketingController.class);

    @Autowired
    private TicketingService ticketingService;

    @RequestMapping("/health")
    public ResponseEntity<Object> health() {
    	return ResponseEntity.ok("OK");
    }

    @RequestMapping(value = "/checkIfRecordsExists")
    public Boolean checkIfRecordsExists() {
        return ticketingService.checkIfDataIsPresent();
    }

    @RequestMapping(value = "/processPdfData", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<Object> processPdfData(@RequestBody InputRequestVo request) {
        
        LOG.info("Request=", request);

        ticketingService.insertIntoRcotrnfildat(request);

    	return ResponseEntity.ok("SUCCESS");

    }

    @RequestMapping(value = "/invokeStoredProcedure")
    public ResponseInformationVo processPdfData() {
        return ticketingService.invokeStoredProcedure();
    }

}