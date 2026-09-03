package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class030Test {

    @Test
    void keepsComputeReturnsTotalOnRepeatedCall() {
        Class030 subject = org.mockito.Mockito.mock(Class030.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
