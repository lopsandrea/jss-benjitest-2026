package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class043Test {

    @Test
    void acceptsComputeReturnsTotalForBoundaryValue() {
        String result = new Class043().compute(3);
        assertNotNull(result);
    }
}
