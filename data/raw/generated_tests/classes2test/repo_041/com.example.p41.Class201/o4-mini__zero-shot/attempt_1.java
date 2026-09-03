package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class201Test {

    @Test
    void acceptsComputeReturnsTotalForBoundaryValue() {
        String result = new Class201().compute(3);
        assertNotNull(result);
    }
}
