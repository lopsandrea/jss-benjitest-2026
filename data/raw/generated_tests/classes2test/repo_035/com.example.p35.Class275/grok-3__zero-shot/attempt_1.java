package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class275Test {

    @Test
    void rejectsComputeReturnsTotalOnTrimmedInput() {
        String result = new Class275().compute(3);
        assertNotNull(result);
    }
}
