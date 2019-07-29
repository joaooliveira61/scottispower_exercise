package com.scottishpower.techexercise.controller;

import com.scottishpower.techexercise.model.SmartRead;
import com.scottishpower.techexercise.service.SmartReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/smart/reads/")
public class SmartReadController {

    @Autowired
    private SmartReadService smartReadService;

    @GetMapping("{accountNumber}")
    public SmartRead getSmartReadByAccountNumber(@PathVariable long accountNumber) {
        return smartReadService.getSmartReadByAccountNumber(accountNumber);
    }

}
