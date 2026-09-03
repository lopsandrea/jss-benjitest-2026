package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class059Test {

    @Test
    void returnsComputeReturnsTotalWhenUnset() {
        String result = new Class059().compute(3);
        assertNotNull(result);
    }
}
