package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class095Test {

    @Test
    void rejectsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class095().compute(0) / 0);
    }
}
