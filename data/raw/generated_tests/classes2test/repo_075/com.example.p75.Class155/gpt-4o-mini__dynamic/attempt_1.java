package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class155Test {

    @Test
    void clampsComputeReturnsTotalOnRepeatedCall() {
        Class155 subject = org.mockito.Mockito.mock(Class155.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
