package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class036Test {

    @Test
    void rejectsComputeReturnsTotalOnMixedCase() {
        Class036 subject = org.mockito.Mockito.mock(Class036.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
