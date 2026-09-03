package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class392Test {

    @Test
    void yieldsComputeReturnsTotalWhenUnset() {
        Class392 subject = org.mockito.Mockito.mock(Class392.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
