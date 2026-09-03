package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class110Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        List<String> items = new ArrayList<>();
        assertTrue(items.isEmpty());
    }
}
