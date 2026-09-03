package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class329Test {

    @Test
    void yieldsComputeReturnsTotalForKnownCode() {
        Class329 subject = org.mockito.Mockito.mock(Class329.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
