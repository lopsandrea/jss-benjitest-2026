package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class065Test {

    @Test
    void yieldsComputeReturnsTotalOnMixedCase() {
        String result = new Class065().compute(3);
        assertNotNull(result);
    }
}
