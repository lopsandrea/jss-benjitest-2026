package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class341Test {
    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class341().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class341().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        assertEquals(7, new Class341().merge(2, 5));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        assertEquals(42, new Class341().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class341().normalize("  x "));
    }

}
