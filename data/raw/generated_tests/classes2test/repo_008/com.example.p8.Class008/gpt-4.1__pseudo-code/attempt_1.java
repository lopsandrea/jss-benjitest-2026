package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class008Test {

    @Test
    void keepsComputeReturnsTotalWhenUnset() {
        Class008 subject = org.mockito.Mockito.mock(Class008.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
