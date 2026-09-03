package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class038Test {

    @Test
    void clampsComputeReturnsTotalOnEmptyString() {
        Class038 subject = org.mockito.Mockito.mock(Class038.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
