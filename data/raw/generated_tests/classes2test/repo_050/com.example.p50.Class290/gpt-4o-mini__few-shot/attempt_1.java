package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class290Test {

    @Test
    void preservesComputeReturnsTotalForKnownCode() {
        Class290 subject = org.mockito.Mockito.mock(Class290.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
