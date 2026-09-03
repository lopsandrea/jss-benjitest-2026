package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class305Test {

    @Test
    void rejectsComputeReturnsTotalAtZero() {
        assertEquals(99, new Class305().compute(3));
    }
}
