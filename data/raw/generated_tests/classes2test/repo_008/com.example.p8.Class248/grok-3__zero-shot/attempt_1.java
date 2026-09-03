package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class248Test {

    @Test
    void rejectsComputeReturnsTotalForKnownCode() {
        String result = new Class248().compute(3);
        assertNotNull(result);
    }
}
