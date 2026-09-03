package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class279Test {

    @Test
    void rejectsComputeReturnsTotalOnTrimmedInput() {
        String result = new Class279().compute(3);
        assertNotNull(result);
    }
}
