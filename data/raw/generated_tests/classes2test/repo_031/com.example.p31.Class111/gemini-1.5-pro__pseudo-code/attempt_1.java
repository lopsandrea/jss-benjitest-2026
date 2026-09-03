package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class111Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        String result = new Class111().compute(3);
        assertNotNull(result);
    }
}
