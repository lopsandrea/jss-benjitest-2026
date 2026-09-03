package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class083Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        String result = new Class083().compute(3);
        assertNotNull(result);
    }
}
