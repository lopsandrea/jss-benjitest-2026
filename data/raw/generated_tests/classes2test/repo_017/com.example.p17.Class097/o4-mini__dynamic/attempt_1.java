package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class097Test {

    @Test
    void rejectsComputeReturnsTotalAtZero() {
        assertEquals(99, new Class097().compute(3));
    }
}
