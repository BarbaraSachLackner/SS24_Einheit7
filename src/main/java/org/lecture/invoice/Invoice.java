package org.lecture.invoice;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Invoice {


    private final BigDecimal amount;
    private final List<PaymentType> paidBy;

    private BigDecimal openAmount;

    public Invoice(BigDecimal amount) {
        this.amount = amount;
        this.openAmount = amount;

        this.paidBy = new ArrayList<>();
    }


    public BigDecimal pay(PaymentType paymentType) {
        if (openAmount.compareTo(BigDecimal.ZERO) != 0) {
            openAmount = openAmount.subtract(paymentType.getAmount());
            this.paidBy.add(paymentType);
            if (openAmount.compareTo(BigDecimal.ZERO) == 0) {
                return BigDecimal.ZERO;
            } else {
                //return openAmount.negate();
                return openAmount.multiply(new BigDecimal(-1));
            }
        } else {
            return paymentType.getAmount();
        }
    }

}
