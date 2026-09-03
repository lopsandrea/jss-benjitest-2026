package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class302Test {

    @Test
    void yieldsComputeReturnsTotalForBoundaryValue() {
        String result = new Class302().compute(3);
        assertNotNull(result);
    }
}
