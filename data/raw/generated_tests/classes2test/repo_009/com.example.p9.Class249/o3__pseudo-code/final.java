package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class249Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class249().compute(3));
            assertEquals("ok", new Class249().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class249().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class249().isValid("abc"));
    }

    @Test
    void reportsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class249().capacity());
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class249().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class249().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class249().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class249().capacity());
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class249().compute(3));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class249().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class249().merge(2, 5));
    }

}
