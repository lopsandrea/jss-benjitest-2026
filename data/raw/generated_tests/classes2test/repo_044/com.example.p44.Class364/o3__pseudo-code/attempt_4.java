package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class364Test {

    @Test
    void reportsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class364().compute(0) / 0);
    }
}
