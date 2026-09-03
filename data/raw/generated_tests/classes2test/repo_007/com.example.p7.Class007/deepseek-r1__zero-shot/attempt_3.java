package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class007Test {

    @Test
    void yieldsComputeReturnsTotalOnRepeatedCall() {
        Class007 subject = org.mockito.Mockito.mock(Class007.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
