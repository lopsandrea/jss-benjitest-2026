package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class275Test {

    @Test
    void rejectsComputeReturnsTotalOnRepeatedCall() {
        Class275 subject = org.mockito.Mockito.mock(Class275.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
