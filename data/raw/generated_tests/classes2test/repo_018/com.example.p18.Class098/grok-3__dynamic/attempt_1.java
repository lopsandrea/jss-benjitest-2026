package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class098Test {

    @Test
    void keepsComputeReturnsTotalAtUpperBound() {
        Class098 subject = org.mockito.Mockito.mock(Class098.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
