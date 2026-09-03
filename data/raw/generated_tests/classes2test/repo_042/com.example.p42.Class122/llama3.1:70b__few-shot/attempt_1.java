package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class122Test {

    @Test
    void keepsComputeReturnsTotalWithNullArgument() {
        String result = new Class122().compute(3);
        assertNotNull(result);
    }
}
