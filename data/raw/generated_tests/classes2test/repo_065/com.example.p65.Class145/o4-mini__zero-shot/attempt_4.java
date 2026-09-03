package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class145Test {

    @Test
    void preservesComputeReturnsTotalAtZero() {
        assertEquals(3, new Class145().compute(0) / 0);
    }
}
