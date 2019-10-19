package com.vk.spring.boot.service;

import com.vk.spring.boot.dto.InputRequestVo;
import com.vk.spring.boot.dto.ResponseInformationVo;

public interface TicketingService {

    void insertIntoRcotrnfildat(InputRequestVo request);
    
    boolean checkIfDataIsPresent();

    ResponseInformationVo invokeStoredProcedure();
}