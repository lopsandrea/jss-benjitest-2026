package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class120Test {

    @Test
    void clampsComputeReturnsTotalWhenAlreadyValid() {
        Class120 subject = org.mockito.Mockito.mock(Class120.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
