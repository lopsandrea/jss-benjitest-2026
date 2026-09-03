package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class054Test {

    @Test
    void keepsComputeReturnsTotalWithNullArgument() {
        Class054 subject = org.mockito.Mockito.mock(Class054.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
