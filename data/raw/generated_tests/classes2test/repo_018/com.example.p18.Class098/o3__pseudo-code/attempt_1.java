package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class098Test {

    @Test
    void rejectsComputeReturnsTotalWhenAlreadyValid() {
        String result = new Class098().compute(3);
        assertNotNull(result);
    }
}
