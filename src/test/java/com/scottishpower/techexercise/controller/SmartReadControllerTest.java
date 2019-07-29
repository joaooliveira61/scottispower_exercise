package com.scottishpower.techexercise.controller;

import com.scottishpower.techexercise.model.SmartRead;
import com.scottishpower.techexercise.repository.SmartReadRepository;
import com.scottishpower.techexercise.service.SmartReadService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SmartReadControllerTest {

    @Mock
    private SmartReadRepository smartReadRepository;

    @InjectMocks
    private SmartReadService smartReadService;

    @Test
    public void testGetSmartReadByValidAccountNumber() {
        Mockito.when(smartReadRepository.findByAccountNumber(1))
                .thenReturn(Optional.of(new SmartRead(1, 1, 1, 200.0, 350.5)));

        SmartRead smartReadValidAccount = smartReadService.getSmartReadByAccountNumber(1);

        assertNotNull(smartReadValidAccount);
        assertEquals(smartReadValidAccount.getAccountNumber(), 1);
        assertEquals(smartReadValidAccount.getElecId(), 1);
        assertEquals(smartReadValidAccount.getGasId(), 1);

        assertEquals(smartReadValidAccount.getElecSmartRead(), 200.0, 0.5);
        assertEquals(smartReadValidAccount.getGasSmartRead(), 350.5, 0.5);
    }

    @Test
    public void testGetSmartReadByInvalidAccountNumber() {
        Mockito.when(smartReadRepository.findByAccountNumber(10))
                .thenReturn(Optional.empty());

        SmartRead smartReadInvalidAccount = smartReadService.getSmartReadByAccountNumber(10);

        assertNull(smartReadInvalidAccount);
    }
}
