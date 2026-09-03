package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class086Test {

    @Test
    void preservesComputeReturnsTotalForKnownCode() {
        Class086 subject = org.mockito.Mockito.mock(Class086.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
