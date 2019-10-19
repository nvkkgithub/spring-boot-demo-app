package com.vk.spring.boot.service.impl;

import com.vk.spring.boot.dto.InputRequestVo;
import com.vk.spring.boot.dto.ResponseInformationVo;
import com.vk.spring.boot.service.TicketingService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TicketingServiceImpl implements TicketingService {

    private static final Logger LOG = LoggerFactory.getLogger(TicketingServiceImpl.class);

    public boolean checkIfDataIsPresent() {
       return true;
    }

    public void insertIntoRcotrnfildat(InputRequestVo request){
        LOG.info("Contents are= ", request);
    }
    
    public ResponseInformationVo invokeStoredProcedure(){
        return new ResponseInformationVo();
    }
}