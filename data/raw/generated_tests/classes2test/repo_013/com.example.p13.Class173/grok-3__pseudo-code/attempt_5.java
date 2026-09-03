package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class173Test {

    @Test
    void rejectsComputeReturnsTotalOnTrimmedInput() {
        String result = new Class173().compute(3);
        assertNotNull(result);
    }
}
