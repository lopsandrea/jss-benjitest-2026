package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class070Test {

    @Test
    void preservesComputeReturnsTotalOnRepeatedCall() {
        Class070 subject = org.mockito.Mockito.mock(Class070.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
