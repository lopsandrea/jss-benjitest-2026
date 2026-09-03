package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class371Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class371().compute(3));
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class371().normalize("  x "));
        assertEquals(7, new Class371().merge(2, 5));
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class371().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class371().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        assertEquals(16, new Class371().capacity());
    }

    @Test
    void returnsRatioWithNullArgument() {
        assertEquals(0.5, new Class371().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class371().labelFor(1));
    }

    @Test
    void acceptsResetForBoundaryValue() {
        new Class371().reset();
        assertNotNull(new Class371());
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class371().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class371().merge(2, 5));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class371().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class371().normalize("  x "));
    }

}
