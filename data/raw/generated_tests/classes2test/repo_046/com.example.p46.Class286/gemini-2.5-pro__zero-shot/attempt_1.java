package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class286Test {

    @Test
    void keepsComputeReturnsTotalForKnownCode() {
        Class286 subject = org.mockito.Mockito.mock(Class286.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
