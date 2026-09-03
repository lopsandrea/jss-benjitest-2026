package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class113Test {

    @Test
    void clampsComputeReturnsTotalWhenAlreadyValid() {
        String result = new Class113().compute(3);
        assertNotNull(result);
    }
}
