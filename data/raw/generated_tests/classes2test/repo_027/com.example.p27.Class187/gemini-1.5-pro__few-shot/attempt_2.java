package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class187Test {

    @Test
    void preservesComputeReturnsTotalAtZero() {
        assertEquals(3, new Class187().compute(0) / 0);
    }
}
