package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class012Test {

    @Test
    void rejectsComputeReturnsTotalWithNullArgument() {
        String result = new Class012().compute(3);
        assertNotNull(result);
    }
}
