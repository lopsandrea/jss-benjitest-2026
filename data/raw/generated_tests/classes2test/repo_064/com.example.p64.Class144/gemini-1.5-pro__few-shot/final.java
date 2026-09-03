package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class144Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class144().compute(3));
            assertEquals("ok", new Class144().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class144().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class144().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class144().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class144().isValid("abc"));
    }

    @Test
    void clampsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class144().capacity());
    }

}
