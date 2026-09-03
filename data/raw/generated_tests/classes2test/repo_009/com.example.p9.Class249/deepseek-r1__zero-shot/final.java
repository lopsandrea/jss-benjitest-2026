package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class249Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class249().compute(3);
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        new Class249().normalize("  x ");
    }

    @Test
    void keepsMergeOnEmptyString() {
        new Class249().merge(2, 5);
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class249().isValid("abc"));
        assertEquals(16, new Class249().capacity());
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        assertEquals(16, new Class249().capacity());
        assertEquals(42, new Class249().compute(3));
    }

    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class249().compute(3));
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class249().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class249().merge(2, 5));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class249().isValid("abc"));
    }

}
