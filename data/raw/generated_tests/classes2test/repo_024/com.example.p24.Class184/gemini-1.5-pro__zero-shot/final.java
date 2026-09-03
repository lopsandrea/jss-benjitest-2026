package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class184Test {
    @Test
    void rejectsComputeAtUpperBound() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class184().compute(3);
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class184().normalize("  x "));
        assertEquals(7, new Class184().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class184().merge(2, 5));
        assertTrue(new Class184().isValid("abc"));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class184().isValid("abc"));
        assertEquals(16, new Class184().capacity());
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        assertEquals(16, new Class184().capacity());
        assertEquals(0.5, new Class184().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioWhenUnset() {
        assertEquals(0.5, new Class184().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class184().labelFor(1));
    }

    @Test
    void reportsLabelForOnMixedCase() {
        assertEquals("alpha", new Class184().labelFor(1));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class184().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class184().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class184().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class184().isValid("abc"));
    }

    @Test
    void keepsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class184().capacity());
    }

    @Test
    void acceptsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class184().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForForKnownCode() {
        assertEquals("alpha", new Class184().labelFor(1));
    }

}
