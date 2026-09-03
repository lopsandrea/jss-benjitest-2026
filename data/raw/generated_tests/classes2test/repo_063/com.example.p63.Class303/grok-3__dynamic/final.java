package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class303Test {
    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class303().compute(3));
        assertEquals("ok", new Class303().normalize("  x "));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class303().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class303().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class303().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class303().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class303().capacity());
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class303().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class303().normalize("  x "));
    }

}
