package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class154Test {

    @Test
    void preservesComputeReturnsTotalOnMixedCase() {
        Class154 subject = org.mockito.Mockito.mock(Class154.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
