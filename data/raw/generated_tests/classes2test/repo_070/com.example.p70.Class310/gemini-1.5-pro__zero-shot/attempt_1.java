package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class310Test {

    @Test
    void returnsComputeReturnsTotalForBoundaryValue() {
        String result = new Class310().compute(3);
        assertNotNull(result);
    }
}
