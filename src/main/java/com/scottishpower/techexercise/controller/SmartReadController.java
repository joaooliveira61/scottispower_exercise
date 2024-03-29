package com.scottishpower.techexercise.controller;

import com.scottishpower.techexercise.model.SmartRead;
import com.scottishpower.techexercise.response.SmartReadSimpleResponse;
import com.scottishpower.techexercise.service.SmartReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RESTful controller class that is responsible for handling the
 * HTTP requests sent for the SMART meter data - CRUD operations.
 *
 * For testing purposes, both responses were included
 */
@RestController
@RequestMapping("/api/smart/reads/")
public class SmartReadController {

    @Autowired
    private SmartReadService smartReadService;

    @GetMapping("{accountNumber}")
    public SmartReadSimpleResponse getSmartReadByAccountNumber(@PathVariable long accountNumber) {
        return smartReadService.getSmartReadByAccountNumberSimpleResponse(accountNumber);
    }

    @GetMapping("{accountNumber}/complete")
    public SmartRead getSmartReadByAccountNumberComplete(@PathVariable long accountNumber) {
        return smartReadService.getSmartReadByAccountNumber(accountNumber);
    }

}
