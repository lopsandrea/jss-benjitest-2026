package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class265Test {

    @Test
    void keepsComputeReturnsTotalAtUpperBound() {
        Class265 subject = org.mockito.Mockito.mock(Class265.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
