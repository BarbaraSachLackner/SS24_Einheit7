package org.lecture.invoice;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString()
public abstract non-sealed class ExternalProvider extends PaymentType {

    protected final String alias;

    public ExternalProvider(BigDecimal amount, String alias) {
        super(amount);
        this.alias = alias;
    }
}
