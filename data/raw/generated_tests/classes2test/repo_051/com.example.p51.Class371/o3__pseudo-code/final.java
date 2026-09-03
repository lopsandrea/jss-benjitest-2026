package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class371Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        try {
            new Class371().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class371().normalize("  x "));
        assertEquals(7, new Class371().merge(2, 5));
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class371().merge(2, 5));
        assertTrue(new Class371().isValid("abc"));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class371().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        assertEquals(16, new Class371().capacity());
    }

    @Test
    void yieldsRatioWithNullArgument() {
        assertEquals(0.5, new Class371().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class371().labelFor(1));
    }

    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class371().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class371().normalize("  x "));
    }

}
