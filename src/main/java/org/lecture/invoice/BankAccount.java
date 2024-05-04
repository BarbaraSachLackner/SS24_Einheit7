package org.lecture.invoice;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString(callSuper = true)
public final class BankAccount extends PaymentType {
    private final String iban;
    private final String bic;
    private final String accountHolder;

    public BankAccount(BigDecimal amount, String iban, String bic, String accountHolder) {
        super(amount);
        this.iban = iban;
        this.bic = bic;
        this.accountHolder = accountHolder;
    }


}
