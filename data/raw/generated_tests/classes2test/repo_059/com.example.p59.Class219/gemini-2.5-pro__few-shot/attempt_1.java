package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class219Test {

    @Test
    void rejectsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class219().compute(0) / 0);
    }
}
