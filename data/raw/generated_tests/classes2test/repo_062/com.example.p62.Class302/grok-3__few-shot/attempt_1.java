package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class302Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        assertEquals(99, new Class302().compute(3));
    }
}
