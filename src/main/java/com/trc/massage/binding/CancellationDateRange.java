package com.trc.massage.binding;

import java.time.*;

public class CancellationDateRange {

    private LocalDate endDate;

    private LocalDate startDate;

    private Price price;

    public CancellationDateRange(LocalDate startDate, LocalDate endDate, Price price) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
