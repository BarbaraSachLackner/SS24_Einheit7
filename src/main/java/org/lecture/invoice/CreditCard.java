package org.lecture.invoice;

import java.math.BigDecimal;

public final class CreditCard extends ExternalProvider {

    private final long cardNumber;
    private final int checkNumber;
    private final String owner;

    public CreditCard(BigDecimal amount, String alias, long cardNumber, int checkNumber, String owner) {
        super(amount, alias);
        this.cardNumber = cardNumber;
        this.checkNumber = checkNumber;
        this.owner = owner;
    }

    @Override
    public String toString() {
        String ccNumber = String.valueOf(cardNumber);
        return "CC by " + owner + ", number " + ccNumber.substring(ccNumber.length() - 4) + ", alias " + alias;
    }
}
