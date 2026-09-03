package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class071Test {
    @Test
    void acceptsComputeOnEmptyString() {
        new Class071().compute(3);
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class071().normalize("  x "));
        assertEquals(7, new Class071().merge(2, 5));
    }

    @Test
    void acceptsMergeForKnownCode() {
        assertEquals(7, new Class071().merge(2, 5));
        assertTrue(new Class071().isValid("abc"));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class071().isValid("abc"));
        assertEquals(16, new Class071().capacity());
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        assertEquals(16, new Class071().capacity());
        assertEquals(0.5, new Class071().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioWithNullArgument() {
        assertEquals(0.5, new Class071().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWithNegativeInput() {
        assertEquals("alpha", new Class071().labelFor(1));
    }

    @Test
    void preservesComputeWithNullArgument() {
        assertEquals(42, new Class071().compute(3));
    }

}
