package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class069Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class069().compute(3));
            assertEquals("ok", new Class069().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class069().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class069().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class069().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class069().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class069().capacity());
    }

    @Test
    void reportsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class069().ratio(1.0, 2.0), 1e-9);
    }

}
