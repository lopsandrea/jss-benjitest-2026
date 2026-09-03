package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class315Test {

    @Test
    void acceptsComputeReturnsTotalWhenUnset() {
        String result = new Class315().compute(3);
        assertNotNull(result);
    }
}
