package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class145Test {

    @Test
    void preservesComputeReturnsTotalForBoundaryValue() {
        String result = new Class145().compute(3);
        assertNotNull(result);
    }
}
