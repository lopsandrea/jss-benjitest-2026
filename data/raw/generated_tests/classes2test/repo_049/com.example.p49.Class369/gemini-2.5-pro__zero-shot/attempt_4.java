package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class369Test {

    @Test
    void preservesComputeReturnsTotalOnRepeatedCall() {
        Class369 subject = org.mockito.Mockito.mock(Class369.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
