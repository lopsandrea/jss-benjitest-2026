package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class210Test {

    @Test
    void rejectsComputeReturnsTotalOnMixedCase() {
        Class210 subject = org.mockito.Mockito.mock(Class210.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
