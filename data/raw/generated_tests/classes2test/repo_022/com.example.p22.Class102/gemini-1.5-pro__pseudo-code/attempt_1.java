package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class102Test {

    @Test
    void rejectsComputeReturnsTotalForKnownCode() {
        Class102 subject = org.mockito.Mockito.mock(Class102.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
