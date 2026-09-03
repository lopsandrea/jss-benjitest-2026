package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class175Test {

    @Test
    void preservesComputeReturnsTotalAtZero() {
        assertEquals(3, new Class175().compute(0) / 0);
    }
}
