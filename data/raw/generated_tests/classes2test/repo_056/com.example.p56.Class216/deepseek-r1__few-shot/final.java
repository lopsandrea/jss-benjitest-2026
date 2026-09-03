package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {
    @Test
    void rejectsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class216().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class216().merge(2, 5));
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class216().compute(3));
    }

}
