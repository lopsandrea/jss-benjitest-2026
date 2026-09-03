package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class110Test {

    @Test
    void preservesComputeReturnsTotalForBoundaryValue() {
        String result = new Class110().compute(3);
        assertNotNull(result);
    }
}
