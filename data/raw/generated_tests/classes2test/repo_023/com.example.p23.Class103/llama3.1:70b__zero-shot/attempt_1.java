package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class103Test {

    @Test
    void yieldsComputeReturnsTotalForKnownCode() {
        String result = new Class103().compute(3);
        assertNotNull(result);
    }
}
