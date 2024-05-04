package org.lecture.invoice;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public sealed abstract class PaymentType permits BankAccount, Cash, ExternalProvider {

    protected final BigDecimal amount;

    public PaymentType(BigDecimal amount) {
        this.amount = amount;
    }
}
