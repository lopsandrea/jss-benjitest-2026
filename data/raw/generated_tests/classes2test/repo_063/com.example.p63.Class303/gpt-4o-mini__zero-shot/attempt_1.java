package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class303Test {

    @Test
    void rejectsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class303().compute(0) / 0);
    }
}
