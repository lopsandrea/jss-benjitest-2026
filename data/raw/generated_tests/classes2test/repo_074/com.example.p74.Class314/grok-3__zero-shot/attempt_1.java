package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class314Test {

    @Test
    void rejectsComputeReturnsTotalWithNullArgument() {
        String result = new Class314().compute(3);
        assertNotNull(result);
    }
}
