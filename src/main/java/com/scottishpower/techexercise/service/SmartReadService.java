package com.scottishpower.techexercise.service;

import com.scottishpower.techexercise.model.SmartRead;
import com.scottishpower.techexercise.repository.SmartReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartReadService {

    @Autowired
    private SmartReadRepository smartReadRepository;

    public SmartRead getSmartReadByAccountNumber(long accountNumber) {
        return smartReadRepository.findByAccountNumber(accountNumber).orElse(null);
    }

}
