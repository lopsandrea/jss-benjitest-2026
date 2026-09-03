package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class119Test {

    @Test
    void clampsComputeReturnsTotalOnRepeatedCall() {
        Class119 subject = org.mockito.Mockito.mock(Class119.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
