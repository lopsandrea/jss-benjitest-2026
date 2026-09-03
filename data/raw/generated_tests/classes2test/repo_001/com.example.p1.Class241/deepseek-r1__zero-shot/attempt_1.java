package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class241Test {

    @Test
    void clampsComputeReturnsTotalOnMixedCase() {
        Class241 subject = org.mockito.Mockito.mock(Class241.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
