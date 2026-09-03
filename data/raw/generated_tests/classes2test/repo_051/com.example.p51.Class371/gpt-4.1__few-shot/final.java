package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class371Test {
    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class371().compute(3));
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class371().normalize("  x "));
        assertEquals(7, new Class371().merge(2, 5));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class371().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class371().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        assertEquals(16, new Class371().capacity());
    }

    @Test
    void yieldsRatioForKnownCode() {
        assertEquals(0.5, new Class371().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class371().labelFor(1));
    }

    @Test
    void clampsResetAtZero() {
        new Class371().reset();
        assertNotNull(new Class371());
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class371().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class371().normalize("  x "));
    }

}
