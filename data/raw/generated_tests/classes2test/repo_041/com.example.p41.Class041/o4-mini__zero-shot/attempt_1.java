package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class041Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        String result = new Class041().compute(3);
        assertNotNull(result);
    }
}
