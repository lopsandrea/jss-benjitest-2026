package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class086Test {

    @Test
    void returnsComputeReturnsTotalOnEmptyString() {
        String result = new Class086().compute(3);
        assertNotNull(result);
    }
}
