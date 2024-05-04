package org.lecture.invoice;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {



    @Test
    public void fullyPaid() {
        Invoice invoice = new Invoice(new BigDecimal(100));
        PaymentType payment = new Cash(new BigDecimal(100), "Barbara");
        //Cash cash = new Cash(new BigDecimal(100), "Barbara");

        BigDecimal actualValue = invoice.pay(payment);
        assertEquals(BigDecimal.ZERO, actualValue);
    }

    @Test
    public void partialPayment() {
        Invoice invoice = new Invoice(new BigDecimal(100));
        PaymentType payment = new Cash(new BigDecimal(70), "Barbara");
        var actualValue = invoice.pay(payment);
        assertEquals(new BigDecimal(-30), actualValue);

    }

    @Test
    public void overpayment() {
        Invoice invoice = new Invoice(new BigDecimal(100));
        PaymentType payment = new Cash(new BigDecimal(120), "Barbara");

        BigDecimal actualValue = invoice.pay(payment);
        assertEquals(new BigDecimal(20), actualValue);
    }


    @Test
    public void invoiceAlreadyPaid() {
        Invoice invoice = new Invoice(new BigDecimal(100));
        PaymentType payment = new Cash(new BigDecimal(100), "Barbara");


        BigDecimal actualValue = invoice.pay(payment);
        assertEquals(BigDecimal.ZERO, actualValue);

        PaymentType paymentCreditCard =
           new CreditCard(BigDecimal.TEN, "foo", 123456789, 123, "Barbara");
        actualValue = invoice.pay(paymentCreditCard);

        assertEquals(BigDecimal.TEN, actualValue);
        assertEquals(1, invoice.getPaidBy().size());

    }

}
