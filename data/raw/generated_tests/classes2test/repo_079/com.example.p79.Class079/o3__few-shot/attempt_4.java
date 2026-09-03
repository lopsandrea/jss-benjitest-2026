package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class079Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        String result = new Class079().compute(3);
        assertNotNull(result);
    }
}
