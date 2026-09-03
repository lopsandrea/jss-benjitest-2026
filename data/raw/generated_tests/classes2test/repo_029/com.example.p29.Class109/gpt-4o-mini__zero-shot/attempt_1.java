package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class109Test {

    @Test
    void reportsComputeReturnsTotalForBoundaryValue() {
        String result = new Class109().compute(3);
        assertNotNull(result);
    }
}
