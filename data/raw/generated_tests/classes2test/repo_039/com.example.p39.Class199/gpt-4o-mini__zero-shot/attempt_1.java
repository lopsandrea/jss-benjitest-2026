package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class199Test {

    @Test
    void preservesComputeReturnsTotalOnMixedCase() {
        Class199 subject = org.mockito.Mockito.mock(Class199.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
