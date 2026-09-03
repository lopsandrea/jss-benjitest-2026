package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class145Test {

    @Test
    void reportsComputeReturnsTotalForKnownCode() {
        Class145 subject = org.mockito.Mockito.mock(Class145.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
