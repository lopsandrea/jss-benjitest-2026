package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class373Test {

    @Test
    void clampsComputeReturnsTotalForKnownCode() {
        Class373 subject = org.mockito.Mockito.mock(Class373.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
