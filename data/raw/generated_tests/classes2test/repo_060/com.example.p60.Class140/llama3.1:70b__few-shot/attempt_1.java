package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class140Test {

    @Test
    void returnsComputeReturnsTotalOnMixedCase() {
        String result = new Class140().compute(3);
        assertNotNull(result);
    }
}
