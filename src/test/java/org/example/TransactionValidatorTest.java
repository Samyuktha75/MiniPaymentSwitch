package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionValidatorTest {

    @Test
    public void testValidTransaction() {

        PaymentTransaction transaction =
                new PaymentTransaction("TXN1001", 1000.0, "PENDING");

        TransactionValidator validator = new TransactionValidator();

        assertTrue(validator.isValid(transaction));
    }

    @Test
    public void testInvalidAmount() {

        PaymentTransaction transaction =
                new PaymentTransaction("TXN1002", -500.0, "PENDING");

        TransactionValidator validator = new TransactionValidator();

        assertFalse(validator.isValid(transaction));
    }

    @Test
    public void testNullTransaction() {

        TransactionValidator validator = new TransactionValidator();

        assertFalse(validator.isValid(null));
    }
}