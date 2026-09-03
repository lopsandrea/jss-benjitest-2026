package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class089Test {
    @Test
    void clampsComputeOnMixedCase() {
        new Class089().compute(3);
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        new Class089().normalize("  x ");
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class089().merge(2, 5));
        assertTrue(new Class089().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class089().isValid("abc"));
        assertEquals(16, new Class089().capacity());
    }

    @Test
    void returnsCapacityOnRepeatedCall() {
        assertEquals(16, new Class089().capacity());
        assertEquals(0.5, new Class089().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsRatioForKnownCode() {
        assertEquals(0.5, new Class089().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class089().labelFor(1));
    }

    @Test
    void yieldsLabelForWhenUnset() {
        assertEquals("alpha", new Class089().labelFor(1));
        new Class089().reset();
        assertNotNull(new Class089());
    }

    @Test
    void clampsResetOnEmptyString() {
        new Class089().reset();
        assertNotNull(new Class089());
        int expected1 = 42;
        assertEquals(expected1, new Class089().compute(3));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class089().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class089().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class089().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class089().capacity());
    }

    @Test
    void acceptsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class089().ratio(1.0, 2.0), 1e-9);
    }

}
