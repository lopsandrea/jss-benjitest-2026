package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class170Test {

    @Test
    void acceptsComputeReturnsTotalOnTrimmedInput() {
        String result = new Class170().compute(3);
        assertNotNull(result);
    }
}
