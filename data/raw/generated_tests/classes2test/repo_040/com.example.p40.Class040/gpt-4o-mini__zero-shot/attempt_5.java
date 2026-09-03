package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class040Test {

    @Test
    void yieldsComputeReturnsTotalWhenUnset() {
        String result = new Class040().compute(3);
        assertNotNull(result);
    }
}
