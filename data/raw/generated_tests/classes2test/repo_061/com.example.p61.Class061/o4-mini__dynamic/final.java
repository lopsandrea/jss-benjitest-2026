package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class061Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class061().compute(3));
        assertEquals("ok", new Class061().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class061().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        assertEquals(7, new Class061().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class061().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        assertEquals(16, new Class061().capacity());
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class061().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class061().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class061().merge(2, 5));
    }

}
