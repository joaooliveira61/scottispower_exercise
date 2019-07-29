package com.scottishpower.techexercise.service;

import com.scottishpower.techexercise.model.SmartRead;
import com.scottishpower.techexercise.repository.SmartReadRepository;
import com.scottishpower.techexercise.response.SmartReadSimpleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service class that sits between the model and the controller,
 * it's responsible for all communication with the SmartRead repository and
 * business logic that is to be applied to the data
 */
@Service
public class SmartReadService {

    @Autowired
    private SmartReadRepository smartReadRepository;

    public SmartRead getSmartReadByAccountNumber(long accountNumber) {
        return smartReadRepository.findByAccountNumber(accountNumber).orElse(null);
    }

    public SmartReadSimpleResponse getSmartReadByAccountNumberSimpleResponse(long accountNumber) {
        Optional<SmartRead> smartRead = smartReadRepository.findByAccountNumber(accountNumber);

        // Because ifPresentOrElse is only present in Java 9, this is required
        if (smartRead.isPresent()) {
            SmartReadSimpleResponse smartReadSimpleResponse  = new SmartReadSimpleResponse();

            smartRead.ifPresent(smartRead1
                    -> {smartReadSimpleResponse.setElecSmartRead(smartRead1.getElecSmartRead());
                smartReadSimpleResponse.setGasSmartRead(smartRead1.getGasSmartRead());});

            return smartReadSimpleResponse;
        }

        return null;
    }

}
