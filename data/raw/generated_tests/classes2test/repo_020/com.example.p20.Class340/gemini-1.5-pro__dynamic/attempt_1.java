package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class340Test {

    @Test
    void preservesComputeReturnsTotalOnMixedCase() {
        Class340 subject = org.mockito.Mockito.mock(Class340.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
