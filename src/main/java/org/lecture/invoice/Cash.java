package org.lecture.invoice;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString(callSuper = true)
public final class Cash extends PaymentType {

    private final String paidBy;

    public Cash(BigDecimal amount, String paidBy) {
        super(amount);
        this.paidBy = paidBy;
    }
}
