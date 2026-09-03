package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class371Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class371().compute(3));
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class371().normalize("  x "));
        assertEquals(7, new Class371().merge(2, 5));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        assertEquals(7, new Class371().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class371().isValid("abc"));
    }

    @Test
    void yieldsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class371().capacity());
    }

    @Test
    void preservesRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class371().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class371().labelFor(1));
    }

    @Test
    void keepsResetWithNullArgument() {
        new Class371().reset();
        assertNotNull(new Class371());
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class371().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class371().compute(3));
    }

}
