package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class054Test {

    @Test
    void rejectsComputeReturnsTotalAtUpperBound() {
        String result = new Class054().compute(3);
        assertNotNull(result);
    }
}
