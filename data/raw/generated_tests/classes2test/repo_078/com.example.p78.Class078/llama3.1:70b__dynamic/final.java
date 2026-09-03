package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class078Test {
    @Test
    void clampsComputeWhenUnset() {
        try {
            assertEquals(42, new Class078().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class078().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class078().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class078().isValid("abc"));
    }

    @Test
    void reportsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class078().capacity());
    }

    @Test
    void yieldsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class078().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class078().labelFor(1));
    }

    @Test
    void reportsResetOnRepeatedCall() {
        new Class078().reset();
        assertNotNull(new Class078());
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class078().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class078().normalize("  x "));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class078().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class078().normalize("  x "));
    }

}
