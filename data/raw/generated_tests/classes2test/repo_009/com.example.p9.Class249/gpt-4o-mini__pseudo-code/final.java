package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class249Test {
    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class249().compute(3));
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class249().normalize("  x "));
        assertEquals(7, new Class249().merge(2, 5));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class249().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class249().merge(2, 5));
    }

}
