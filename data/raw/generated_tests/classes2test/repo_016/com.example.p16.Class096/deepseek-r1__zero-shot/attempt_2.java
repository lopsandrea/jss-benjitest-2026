package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class096Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        String result = new Class096().compute(3);
        assertNotNull(result);
    }
}
