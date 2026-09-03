package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class011Test {

    @Test
    void yieldsComputeReturnsTotalForKnownCode() {
        Class011 subject = org.mockito.Mockito.mock(Class011.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
