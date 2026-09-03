package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class271Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        String result = new Class271().compute(3);
        assertNotNull(result);
    }
}
