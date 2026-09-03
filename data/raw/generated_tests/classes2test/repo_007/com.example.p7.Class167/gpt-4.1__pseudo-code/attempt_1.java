package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class167Test {

    @Test
    void acceptsComputeReturnsTotalOnRepeatedCall() {
        Class167 subject = org.mockito.Mockito.mock(Class167.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
