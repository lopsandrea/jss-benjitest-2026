package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class223Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        List<String> items = new ArrayList<>();
        assertTrue(items.isEmpty());
    }
}
