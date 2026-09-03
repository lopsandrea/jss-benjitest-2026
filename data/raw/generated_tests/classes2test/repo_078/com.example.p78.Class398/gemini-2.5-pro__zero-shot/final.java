package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class398Test {
    @Test
    void reportsComputeForKnownCode() {
        assertEquals(42, new Class398().compute(3));
        assertEquals("ok", new Class398().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class398().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class398().merge(2, 5));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class398().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class398().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class398().capacity());
    }

}
