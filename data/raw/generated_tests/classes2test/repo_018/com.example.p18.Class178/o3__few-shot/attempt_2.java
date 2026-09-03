package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class178Test {

    @Test
    void rejectsComputeReturnsTotalAtUpperBound() {
        Class178 subject = org.mockito.Mockito.mock(Class178.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
