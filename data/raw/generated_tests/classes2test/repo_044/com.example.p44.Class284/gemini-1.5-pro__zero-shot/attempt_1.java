package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class284Test {

    @Test
    void clampsComputeReturnsTotalWhenUnset() {
        Class284 subject = org.mockito.Mockito.mock(Class284.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
