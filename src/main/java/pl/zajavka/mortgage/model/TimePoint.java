package pl.zajavka.mortgage.model;

import lombok.Value;
import lombok.With;

import java.math.BigDecimal;
import java.time.LocalDate;

@Value
@With
public class TimePoint {

    BigDecimal year;
    BigDecimal month;
    LocalDate date;

}
