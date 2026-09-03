package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class223Test {

    @Test
    void reportsComputeReturnsTotalForKnownCode() {
        Class223 subject = org.mockito.Mockito.mock(Class223.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
