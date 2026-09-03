package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class143Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        String result = new Class143().compute(3);
        assertNotNull(result);
    }
}
