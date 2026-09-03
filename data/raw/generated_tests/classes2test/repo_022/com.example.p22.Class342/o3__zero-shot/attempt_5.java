package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class342Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        assertEquals(99, new Class342().compute(3));
    }
}
