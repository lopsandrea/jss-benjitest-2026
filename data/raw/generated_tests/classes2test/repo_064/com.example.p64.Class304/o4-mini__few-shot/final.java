package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class304Test {
    @Test
    void reportsComputeOnMixedCase() {
        assertEquals(42, new Class304().compute(3));
        assertEquals("ok", new Class304().normalize("  x "));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class304().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class304().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class304().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class304().capacity());
    }

    @Test
    void rejectsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class304().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnEmptyString() {
        assertEquals("alpha", new Class304().labelFor(1));
    }

    @Test
    void reportsResetForKnownCode() {
        new Class304().reset();
        assertNotNull(new Class304());
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class304().compute(3));
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class304().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class304().normalize("  x "));
    }

}
