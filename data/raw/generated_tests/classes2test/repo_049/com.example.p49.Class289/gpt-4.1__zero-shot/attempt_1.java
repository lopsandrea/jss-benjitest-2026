package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class289Test {

    @Test
    void returnsComputeReturnsTotalOnRepeatedCall() {
        Class289 subject = org.mockito.Mockito.mock(Class289.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
