package pl.zajavka.mortgage.services;

import org.junit.jupiter.api.Test;
import pl.zajavka.mortgage.model.InputData;
import pl.zajavka.mortgage.model.Overpayment;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AmountsCalculationServiceImplTest {

    @Test
    void shouldCalculateCorrectly() {
        //given
        final InputData inputData = InputData.defaultInputData();
        final Overpayment overpayment = new Overpayment(BigDecimal.valueOf(2000), BigDecimal.ZERO);

        //when

    }

}