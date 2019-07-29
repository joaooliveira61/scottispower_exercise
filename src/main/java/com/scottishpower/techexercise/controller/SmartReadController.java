package com.scottishpower.techexercise.controller;

import com.scottishpower.techexercise.model.SmartRead;
import com.scottishpower.techexercise.repository.SmartReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/smart/reads/")
public class SmartReadController {

    @Autowired
    private SmartReadRepository smartReadRepository;


    @GetMapping("{accountNumber}")
    public SmartRead getSmartReadByAccountNumber(@PathVariable long accountNumber) {
        SmartRead smartRead = smartReadRepository.findByAccountNumber(accountNumber).orElse(null);

        return smartRead;
    }

}
