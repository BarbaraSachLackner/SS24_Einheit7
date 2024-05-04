package org.lecture.invoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CreditCardTest {

    @Test
    public void onlyLast4Digits() {
        CreditCard paymentCreditCard =
                new CreditCard(BigDecimal.TEN, "foo", 123456789, 123, "Barbara");
        String expected = "CC by Barbara, number 6789, alias foo";
        Assertions.assertEquals(expected, paymentCreditCard.toString());
    }
}
