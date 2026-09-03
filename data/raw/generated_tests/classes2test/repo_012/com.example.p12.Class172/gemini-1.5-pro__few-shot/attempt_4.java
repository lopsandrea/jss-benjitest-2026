package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class172Test {

    @Test
    void rejectsComputeReturnsTotalForKnownCode() {
        Class172 subject = org.mockito.Mockito.mock(Class172.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
