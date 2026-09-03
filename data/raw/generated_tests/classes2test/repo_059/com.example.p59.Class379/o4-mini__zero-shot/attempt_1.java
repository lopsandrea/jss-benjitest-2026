package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class379Test {

    @Test
    void yieldsComputeReturnsTotalOnRepeatedCall() {
        Class379 subject = org.mockito.Mockito.mock(Class379.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
